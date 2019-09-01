package org.provarules.parser2;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaResultSet;
import org.provarules.kernel2.ProvaRule;
import org.provarules.parser.Prova2Lexer;
import org.provarules.parser.Prova2Parser;
import org.provarules.parser.ProvaWalker2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProvaParserImpl {

    private final static Logger log = LoggerFactory.getLogger("prova");

    public static ThreadLocal<Object[]> tlObjects = new ThreadLocal<>();

    public static ThreadLocal<ProvaKnowledgeBase> tlKB = new ThreadLocal<>();

    private static ThreadLocal<Random> tlRandom = new ThreadLocal<>();

    public static ThreadLocal<ProvaResultSet> tlRS = new ThreadLocal<>();

    public static ThreadLocal<String> tlSrc = new ThreadLocal<>();

    // The source being parsed ("reader" or filename)
    private String src;

    // Java objects passed to the parser
    private final Object[] objects;

    public static class SimpleErrorReporter implements ProvaErrorReporter {

        ProvaParsingException pex = new ProvaParsingException();

        @Override
        public void reportError(String error) {
            String[] e = error.split(" ", 3);
            pex.addError(e[1], e[2]);
            log.warn("Error parsing prova: " + error);
        }

        @Override
        public ProvaParsingException getErrors() {
            return pex;
        }

    }

    private static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            return new ProvaAST(payload);
        }

        @Override
        public void addChild(Object t1, Object t2) {
            ProvaAST ast1 = (ProvaAST) t1;
            ProvaAST ast2 = (ProvaAST) t2;
            if (ast1.getLine() == 0) {
                ast1.setLine(ast2.getLine());
                ast1.setColumn(ast2.getColumn());
            }
            super.addChild(t1, t2);
        }

        @Override
        public Object errorNode(TokenStream ts, Token t1, Token t2, RecognitionException rex) {
            ProvaErrorNode pen = new ProvaErrorNode(null);
            pen.setErrorNode((CommonErrorNode) super.errorNode(ts, t1, t2, rex));
            return pen;
        }
    };

    public ProvaParserImpl(String src, Object[] objects) {
        this.src = src;
        this.objects = objects;
    }

    @SuppressWarnings("unchecked")
    public List<ProvaRule> parse(final ProvaKnowledgeBase kb, final ProvaResultSet resultSet, final BufferedReader in) throws ProvaParsingException, IOException {
        List<ProvaRule> rules = new ArrayList<>();
        Prova2Lexer lex = new Prova2Lexer(new ANTLRReaderStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        Prova2Parser parser = new Prova2Parser(tokens);
        ProvaErrorReporter errorReporter = new SimpleErrorReporter();
        parser.setErrorReporter(errorReporter);
        parser.setTreeAdaptor(adaptor);

        try {
            tlObjects.set(objects);
            tlRandom.set(new Random());
            tlKB.set(kb);
            tlRS.set(resultSet);
            tlSrc.set(src);

            Prova2Parser.rulebase_return r = parser.rulebase();
            if (!errorReporter.getErrors().errors().isEmpty())
                throw errorReporter.getErrors();
            CommonTree tree = (CommonTree) r.getTree();
            if (log.isDebugEnabled())
                log.debug(tree.toStringTree());
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(adaptor, tree);
            ProvaWalker2 walker = new ProvaWalker2(nodes);
            walker.setErrorReporter(errorReporter);
            List<List<?>> results = walker.rulebase();
            for (List result : results) {
                rules.add((ProvaRule) result.get(2));
//				// Accumulate goals and clauses for subsequent commit
//				temp_kb.insert_item(result.toArray());
            }
        } catch (Exception e) {
            ProvaParsingException pex = errorReporter.getErrors();
            pex.setSource(src);
            if (pex.errors().isEmpty()) {
                // A walker error
                pex.addError("0", "Prova walker reported a parsing error");
            }
            if (e instanceof RuntimeException && e.getLocalizedMessage() != null)
                pex.addError("0", e.getLocalizedMessage());
            pex.setDescription("Syntax errors occurred when parsing");
            throw pex;
        } finally {
            if (tlSrc != null)
                tlSrc.remove();
            if (tlObjects != null)
                tlObjects.remove();
            if (tlRandom != null)
                tlRandom.remove();
            if (tlKB != null)
                tlKB.remove();
            if (tlRS != null)
                tlRS.remove();
        }

        return rules;
    }

    public List<ProvaRule> parse(ProvaKnowledgeBase kb,
                                 ProvaResultSet resultSet, String filename) throws IOException, ProvaParsingException {
        File file = new File(filename);
        BufferedReader in;
        InputStream is = null;
        try {
            if (!file.exists() || !file.canRead()) {
                try {
                    is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
                    in = new BufferedReader(
                            new InputStreamReader(is));
                } catch (Exception ex1) {
                    try {
                        is = ProvaParserImpl.class.getClassLoader().getResourceAsStream(filename);
                        in = new BufferedReader(
                                new InputStreamReader(is));
                    } catch (Exception ex2) {
                        try {
                            // not sure this is ever needed; think the above is preferred.
                            // (this one looks relative to the package in classpath.)
                            is = ProvaParserImpl.class.getResourceAsStream(filename);
                            in = new BufferedReader(
                                    new InputStreamReader(is));
                        } catch (Exception ex3) {
                            try {
                                // Added by Adrian :
                                // read KB / module from URL
                                URL url = new URL(filename);
                                in = new BufferedReader(new InputStreamReader(url.openStream()));
                            } catch (Exception ex4) {
                                throw new IOException("Cannot find " + filename);
                            }
                        }
                    }
                }
            } else {
                FileReader fr = new FileReader(file);
                in = new BufferedReader(fr);
            }
            kb.updateContext(filename);
            return parse(kb, resultSet, in);
        } finally {
            if (is != null)
                is.close();
        }
    }

}

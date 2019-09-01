package org.provarules.reference2;

import org.provarules.kernel2.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ProvaRuleImpl implements ProvaRule {

    private final static Logger log = LoggerFactory.getLogger("prova");

    private long ruleId;

    private List<ProvaVariable> variables = new ArrayList<>();

    private ProvaLiteral head;

    private ProvaLiteral[] body;

    private int offset = 0;

    private Object firstArg;

    private boolean removed = false;

    private int cut = 0;

    private String sourceCode;

    private Map<String, List<Object>> metadata;

    private int line;

    private ProvaRuleImpl() {
    }

    public ProvaRuleImpl(long ruleId, ProvaLiteral head, ProvaLiteral[] body) {
        this.ruleId = ruleId;
        setHead(head);
        this.body = body;
        if (ruleId != 0)
            collectVariables();
        for (ProvaVariable variable : variables)
            variable.setRuleId(ruleId);
        if (this.head != null)
            this.head.addClause(this);
        if (log.isDebugEnabled())
            getSourceCode();
    }

    public ProvaRuleImpl(long ruleId, ProvaLiteral head,
                         ProvaLiteral[] body, boolean addInFront) {
        this.ruleId = ruleId;
        setHead(head);
        this.body = body;
        if (ruleId != 0)
            collectVariables();
        for (ProvaVariable variable : variables)
            variable.setRuleId(ruleId);
        if (this.head != null)
            this.head.addClauseA(this);
    }

    public static ProvaRule createVirtualRule(long ruleId, ProvaLiteral head, ProvaLiteral[] body) {
        ProvaRuleImpl newRule = new ProvaRuleImpl();
        newRule.ruleId = ruleId;
        newRule.setHead(head);
        newRule.body = body;
        if (ruleId != 0)
            newRule.collectVariables();
        for (ProvaVariable variable : newRule.variables)
            variable.setRuleId(ruleId);
        return newRule;
    }

    /*
     * Generate rule for a goal
     */
    public ProvaRuleImpl(ProvaLiteral[] body) {
        this.ruleId = 0;
//		this.head = null;
        this.body = body;
        collectVariables();
        for (ProvaVariable variable : variables)
            variable.setRuleId(ruleId);
        if (this.head != null)
            this.head.addClause(this);
    }

    private ProvaRuleImpl(ProvaRuleImpl o) {
        this.ruleId = o.ruleId;
        this.variables = o.cloneVariables();
        setHead(o.head);
        if (o.offset != 0 && o.body != null && o.body.length != 0) {
            this.body = new ProvaLiteral[o.body.length - o.offset];
            System.arraycopy(o.body, o.offset, this.body, 0, o.body.length - o.offset);
            return;
        }
        this.body = o.body;
    }

    private ProvaRuleImpl(ProvaRuleImpl o, boolean cloneVariables) {
        this.ruleId = o.ruleId;
        this.variables = cloneVariables ? o.cloneVariables() : o.getVariables();
        this.head = o.head;
        if (o.offset != 0 && o.body != null && o.body.length != 0) {
            this.body = new ProvaLiteral[o.body.length - o.offset];
            System.arraycopy(o.body, o.offset, this.body, 0, o.body.length - o.offset);
            return;
        }
        this.body = o.body;
        this.sourceCode = o.sourceCode;
        this.line = o.line;
        this.metadata = o.metadata;
    }

    public ProvaRuleImpl(long ruleId, ProvaLiteral head, ProvaLiteral[] body,
                         List<ProvaVariable> variables) {
        this.ruleId = ruleId;
        int size = variables.size();
        for (ProvaVariable variable : variables) {
            this.variables.add(variable.clone(ruleId));
        }
        this.head = head;
        this.body = body;
    }

    @Override
    public void collectVariables() {
        if (head != null)
            head.collectVariables(ruleId, variables);
        if (body != null)
            for (ProvaLiteral literal : body)
                literal.collectVariables(ruleId, variables);
    }

    @Override
    public void collectVariables(int offset) {
        if (head != null)
            head.collectVariables(ruleId, variables);
        if (body != null)
            for (int i = offset; i < body.length; i++)
                body[i].collectVariables(ruleId, variables);
    }

    @Override
    public void substituteVariables(ProvaVariablePtr[] varsMap) {
        if (head != null) {
            head.substituteVariables(varsMap);
        }
        if (body != null)
            for (ProvaLiteral literal : body) {
                literal.substituteVariables(varsMap);
            }
    }

    @Override
    public void setVariables(List<ProvaVariable> variables) {
        this.variables = variables;
    }

    @Override
    public List<ProvaVariable> getVariables() {
        return variables;
    }

    public void setHead(ProvaLiteral head) {
        if (head == null)
            return;
        this.head = head;
        final ProvaObject[] fixed = head.getTerms().getFixed();
        if (fixed != null && fixed.length != 0) {
            if (fixed[0] instanceof ProvaConstant)
                this.firstArg = ((ProvaConstant) fixed[0]).getObject();
            else
                this.firstArg = "@";
        }
    }

    @Override
    public ProvaLiteral getHead() {
        return head;
    }

    public void setBody(ProvaLiteral[] body) {
        this.body = body;
    }

    @Override
    public ProvaLiteral[] getBody() {
        return body;
    }

    /**
     * Get body with a prefix containing guard literals if sourceLiteral is ProvaGuardedLiteralImpl
     */
    @Override
    public ProvaLiteral[] getGuardedBody(ProvaLiteral sourceLiteral) {
        if (sourceLiteral instanceof ProvaGuardedLiteralImpl) {
            List<ProvaLiteral> guard = sourceLiteral.getGuard();
            ProvaLiteral[] guardedBody = new ProvaLiteral[guard.size() + body.length];
            int index = 0;
            for (ProvaLiteral g : guard)
                guardedBody[index++] = g;
            System.arraycopy(body, 0, guardedBody, guard.size(), body.length);
            return guardedBody;
        }
        return body;
    }

    @Override
    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public long getRuleId() {
        return ruleId;
    }

    @Override
    public long getAbsRuleId() {
        return ruleId >= 0 ? ruleId : -ruleId;
    }

    @Override
    public ProvaRule cloneRule() {
        ProvaRuleImpl newRule = new ProvaRuleImpl(this);
        return newRule;
    }

    @Override
    public ProvaRule cloneRule(boolean cloneVariables) {
        if (this.variables.isEmpty())
            return this;
        ProvaRuleImpl newRule = new ProvaRuleImpl(this, cloneVariables);
        return newRule;
    }


    @Override
    public List<ProvaVariable> cloneVariables() {
        int size = variables.size();
        List<ProvaVariable> newVariables = new ArrayList<>(size);
        for (ProvaVariable variable : variables) {
            newVariables.add(variable.clone());
        }
        return newVariables;
    }

    /**
     * Advance the goal to the next query
     *
     * @return True if the next query is fail
     */
    @Override
    public boolean advance() {
        offset++;
        return offset != body.length && body[offset].getTerms() == null;
    }

    @Override
    public ProvaLiteral getTop() {
        return offset < body.length ? body[offset] : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head != null) {
            Map<String, List<Object>> metadata = head.getMetadata();
            if (metadata != null && !metadata.isEmpty()) {
                sb.append(metadata);
                sb.append(" ");
            }
            sb.append(head.cloneWithVariables(ruleId, variables));
        }
        if (body != null) {
            sb.append(":-");
            for (int i = offset; i < body.length; i++) {
                if (i != 0)
                    sb.append(',');
                else {
                    Map<String, List<Object>> metadata = body[i].getMetadata();
                    if (metadata != null && !metadata.isEmpty()) {
                        sb.append(metadata);
                        sb.append(" ");
                    }
                }
                sb.append(body[i].cloneWithVariables(ruleId, variables));
            }
        }
        return sb.toString();
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public void addBodyLiteral(ProvaLiteral literal) {
        ProvaLiteral[] newBody = new ProvaLiteral[body.length + 1];
        System.arraycopy(body, 0, newBody, 0, body.length);
        newBody[body.length] = literal;
        body = newBody;
        collectVariables(offset);
    }

    @Override
    public void replaceTopBodyLiteral(List<ProvaLiteral> literals) {
        if (literals.size() == 1) {
            body[offset] = literals.get(0);
            return;
        }
        int size = literals.size() - 1;
        ProvaLiteral[] newBody = new ProvaLiteral[body.length + size - offset];
        newBody[0] = literals.get(0);
        System.arraycopy(body, offset + 1, newBody, 1 + size, body.length - offset - 1);
        for (int i = 1; i <= size; i++)
            newBody[i] = literals.get(i);
        body = newBody;
        offset = 0;
        // We must not collect variables here as substitutions of constants are made after the unification stage
//		collectVariables(offset);
    }

    @Override
    public Object getFirstArg() {
        return firstArg;
    }

    @Override
    public void removeAt(int index) {
        if (offset + index >= body.length)
            return;
        ProvaLiteral[] newBody = new ProvaLiteral[body.length - 1 - offset];
        System.arraycopy(body, offset + index + 1, newBody, index, body.length - 2 - offset);
        newBody[0] = body[0];
        body = newBody;
    }

    @Override
    public boolean isRemoved() {
        return this.removed;
    }

    @Override
    public void setRemoved() {
        this.removed = true;
    }

    @Override
    public boolean isCut() {
        if (cut == 0) {
            cut = -1;
            if (body != null && body.length != 0) {
                String symbol = body[offset].getPredicate().getSymbol();
                if (symbol.equals("cut"))
                    cut = 1;
            }
        }
        return cut > 0;
    }

    @Override
    public String getSourceCode() {
        if (log.isDebugEnabled() && this.sourceCode == null) {
            if (head != null && head.getPredicate().getSymbol().length() == 0)
                return toString();
            StringBuilder sb = new StringBuilder();
            if (head != null)
                sb.append(head.getSourceCode());
            sb.append(":-");
            if (body != null) {
                for (int i = offset; i < body.length; i++) {
                    if (i != offset)
                        sb.append(',');
                    sb.append(body[i].getSourceCode());
                }
            }
            sb.append('.');
            this.sourceCode = sb.toString();
        }
        return this.sourceCode;
    }

    @Override
    public void computeSourceCode() {
        if (log.isDebugEnabled()) {
            if (head != null)
                head.setSourceCode(head.cloneWithVariables(variables).toString());
            if (body == null)
                return;
            for (int i = offset; i < body.length; i++)
                body[i].setSourceCode(body[i].cloneWithVariables(variables).toString());
        }
    }

    @Override
    public void setMetadata(String property, List<Object> value) {
        if (metadata == null)
            metadata = new HashMap<>();
        metadata.put(property, value);
    }

    @Override
    public void setSrc(List<Object> value) {
        if (metadata == null)
            metadata = new HashMap<>();
        metadata.put("src", value);
        final String src = (String) value.get(0);
        final ProvaPredicate predicate = head.getPredicate();
        predicate.getClauseSet().addRuleToSrc(this, src);
        predicate.getKnowledgeBase().addClauseSetToSrc(predicate.getClauseSet(), src);
    }

    @Override
    public List<Object> getMetadata(String property) {
        return metadata == null ? null : metadata.get(property);
    }

    @Override
    public void addMetadata(Map<String, List<Object>> m) {
        if (m == null)
            return;
        if (metadata == null)
            this.metadata = new HashMap<>();
        this.metadata.putAll(m);
    }

    @Override
    public Map<String, List<Object>> getMetadata() {
        if (metadata != null)
            return metadata;
        return Collections.emptyMap();
    }

    @Override
    public void setLine(int line) {
        if (metadata == null)
            metadata = new HashMap<>();
        metadata.put("line", Arrays.asList(Integer.toString(line)));
        this.line = line;
    }

    @Override
    public int getLine() {
        return this.line;
    }

}

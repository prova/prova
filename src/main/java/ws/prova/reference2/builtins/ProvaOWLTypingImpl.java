package ws.prova.reference2.builtins;

import java.util.List;




import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.typing.ProvaOntology;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.typing.ProvaCachedOntologyImpl;
import ws.prova.reference2.typing.ProvaOntClassImpl;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.ontology.OntClass;

/**
 * builtin syntax:
 * 
 * owl_typing("URL", ["languageURI"]). 
 * 
 * first argument is the URI of the ontology to be loaded
 * second argument the URI of a language supported by Jena,
 * e.g. one of the following:
 * 
 * http://www.w3.org/2000/01/rdf-schema #
 * http://www.daml.org/2001/03/daml oil #
 * http://www.w3.org/2002/07/owl #
 * http://www.w3.org/TR/owl-features/ # term_OWLDL
 * http://www.w3.org/TR/owl-features/ # term_OWLLite
 * 
 * Default is OWL DL. 
 *
 * 
 * @author martin
 *
 */

public class ProvaOWLTypingImpl extends ProvaBuiltinImpl {

	final ProvaKnowledgeBase kb;
	
	public ProvaOWLTypingImpl(ProvaKnowledgeBase kb)
	{
		super(kb,"owl_typing");
		this.kb=kb;
	}
	
	// TODO: needs full revision
	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		
		String url, languageURI;
		
		/*** this is the code to retrieve the arguments ****/
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length<1||data.length>2 )
		{
			throw new IllegalArgumentException("Invalid number of parameters in owl_typing");
		}
		ProvaObject d = data[0];
		if( d instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) d;
			d = variables.get(varPtr.getIndex()).getRecursivelyAssigned();	 
		}
		url= ((ProvaConstant) d).getObject().toString();
		
		if(data.length>1)
		{
			d=data[1];
			if( d instanceof ProvaVariablePtr ) {
				ProvaVariablePtr varPtr = (ProvaVariablePtr) d;
				d = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			}
			languageURI=((ProvaConstant) d).getObject().toString();
		}
		else
			languageURI="http://www.w3.org/TR/owl-features/#term_OWLDL";
		
		
		/***********************************************************/

		

		/* read the model: */
		ProvaOntology ont = kb.getOntology();
		if(ont==null)
		{
			ont=new ProvaCachedOntologyImpl(languageURI);
			kb.setOntology(ont);
		}

		ont.addOntology(url);

		return false;
	}

}

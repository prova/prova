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
import ws.prova.reference2.typing.ProvaOWLTypeImpl;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.ontology.OntClass;

/**
 * builtin syntax:
 * 
 * owl_typing("myOwlModel.rdf", "prefix1", "NS1", "prefix2", "NS2"...). 
 * 
 * first argument is the name of the OWL file to be loaded.
 * the following (optional) arguments specify additional prefix/namespace mappings.
 *
 * TODO: importing a second model overwrites the first one...
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
	
	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		
		String url, languageURI;
		
		/*** this is the code to retrieve the arguments ****/
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if(data.length<1||data.length>2)
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

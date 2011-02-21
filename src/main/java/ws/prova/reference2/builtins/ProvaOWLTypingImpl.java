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

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.ontology.OntClass;

/**
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
		
		
		/*** this is the code to retrieve the actual argument ****/
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		String filename = ((ProvaConstant) lt).getObject().toString();
		/***********************************************************/

		// read the model
		//TODO: deal with different encodings, file formats, exceptions...
		OntModel m=ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RULE_INF);
		m.read(filename);
		
		kb.setOntologyModel(m);
		return false;
	}

}

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
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
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
 * TODO: is the knowledgebase the right place to store the model?
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
		
		
		/*** this is the code to retrieve the first argument ****/
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		ProvaObject lt = data[0];
		if(data.length%2==0)
		{
			throw new RuntimeException("invalid number of parameters!");
		}
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		String filename = ((ProvaConstant) lt).getObject().toString();
		/***********************************************************/

		
		/* read the model: */
		
		//TODO: deal with different encodings, file formats, exceptions...
		OntModel m=ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RULE_INF);
		m.read(filename);
		
		
		/* add user defined prefixes: */
		
		// TODO: do we even need this feature? 
		// usually prefixes are defined in the OWL-file...
		
		for(int i=1;i<data.length;i+=2)
		{
			
			try
			{
				String prefix =(String)((ProvaConstant)data[i]).getObject(),
					namespace =(String)((ProvaConstant)data[i+1]).getObject();
				m.setNsPrefix(prefix, namespace);
			}
			catch(ClassCastException e)
			{
				throw new RuntimeException("only strings allowed in OWL prefix mapping parameters");	
			}
		}
		m.setNsPrefixes(m);
		kb.setOntologyModel(m);
		return false;
	}

}

package test.ws.prova.test2;

import java.io.FileOutputStream;


import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import org.junit.*;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;


public class ProvaOWLTest {

	private static final String kAgent = "prova";
	private static final String kPort = null;
	public static final String namespace = "test://";
	
	@Test
	public void create()
	{
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RULE_INF);
		OntClass bauer = model.createClass(namespace+"bauer");
		OntClass schachfigur = model.createClass(namespace+"schachfigur");

		// ein bauer ist eine schachfigur
		schachfigur.addSubClass(bauer);

		// horst ist ein bauer
		Individual horst = bauer.createIndividual(namespace+"horst");
		
		
		// how to retrieve a resource without knowing the namespace:
//		String base_namespace=model.getNsPrefixURI("");
	//	System.out.println(base_namespace);
		//bauer=model.getOntClass(base_namespace+"bauer");
		
		
		// einmal bauer immer bauer
		org.junit.Assert.assertTrue(bauer.hasSuperClass(bauer));
		
		// also ist bauer horst eine schachfigur
		org.junit.Assert.assertTrue(horst.hasOntClass(schachfigur));
		
		boolean succesfulWrite=true;
		try
		{
			
			model.write(new FileOutputStream("rules/ont/testOntology.rdf"), "RDF/XML-ABBREV");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			succesfulWrite=false;
		}
		finally
		{
			Assert.assertTrue(succesfulWrite);
		}
	}
		
	@Test
	public void test()
	{
		final String rulebase = "rules/reloaded/ontology_test.prova";
		try {
			ProvaCommunicator pc=new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
			Assert.assertTrue(pc.getReagent().getKb().getOntologyModel()!=null);
			Assert.assertTrue(pc.getInitializationSolutions().get(0).length==3);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

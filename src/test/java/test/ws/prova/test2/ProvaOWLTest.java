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
		OntClass pawn = model.createClass(namespace+"pawn");
		OntClass chesspiece = model.createClass(namespace+"chesspiece");
		OntClass rook= model.createClass(namespace+"rook");
		
		pawn.addSuperClass(chesspiece);
		rook.addSuperClass(chesspiece);
		
		org.junit.Assert.assertTrue(pawn.hasSuperClass(pawn));
		org.junit.Assert.assertTrue(pawn.hasSuperClass(chesspiece));
		
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
			Assert.assertEquals(3,pc.getInitializationSolutions().get(1).length);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2()
	{
		final String rulebase = "rules/reloaded/typedOWL.prova";
		try {
			ProvaCommunicator pc=new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
			Assert.assertTrue(pc.getReagent().getKb().getOntologyModel()!=null);
			Assert.assertEquals(4,pc.getInitializationSolutions().size());
			Assert.assertEquals(1,pc.getInitializationSolutions().get(1).length);
			Assert.assertEquals(2,pc.getInitializationSolutions().get(2).length);
			Assert.assertEquals(2,pc.getInitializationSolutions().get(3).length);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

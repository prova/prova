package test.ws.prova.aux;

import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;

public class ProvaListAux {

	public static int calculateSize(ProvaList l){
		return l.getFixed().length;
	}
	
	public static ProvaList createProvaList(){
		return ProvaListImpl.create(new
				ProvaObject[]{ProvaConstantImpl.create("a"),ProvaConstantImpl.create("b")});
	}

}

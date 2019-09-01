package org.provarules.helper;

import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;

public class ProvaListAux {

	public static int calculateSize(ProvaList l){
		return l.getFixed().length;
	}
	
	public static ProvaList createProvaList(){
		return ProvaListImpl.create(new
				ProvaObject[]{ProvaConstantImpl.create("a"),ProvaConstantImpl.create("b")});
	}

}

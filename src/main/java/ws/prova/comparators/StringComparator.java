package ws.prova.comparators;

import java.util.Comparator;

import ws.prova.kernel2.ProvaConstant;

public class StringComparator implements Comparator<Object> {
	public static StringComparator stringComparator = new StringComparator();
	
	private StringComparator() {};
	
    public int compare(Object o1, Object o2) {
    	if( !(o2 instanceof ProvaConstant) )
    		return -1;
    	if( !(o1 instanceof ProvaConstant) )
    		return 1;
        return String.valueOf(o1).compareTo(String.valueOf(o2));
    }
}


package org.provarules.comparators;

import org.provarules.kernel2.ProvaConstant;

import java.util.Comparator;

public class StringComparator implements Comparator<Object> {
    public static StringComparator stringComparator = new StringComparator();

    private StringComparator() {
    }

    ;

    public int compare(Object o1, Object o2) {
        if (!(o2 instanceof ProvaConstant))
            return -1;
        if (!(o1 instanceof ProvaConstant))
            return 1;
        return String.valueOf(o1).compareTo(String.valueOf(o2));
    }
}


package org.provarules.examples;

import java.util.ArrayList;
import java.util.List;

public class IBMPortfolio extends Portfolio {

    private static final long serialVersionUID = -7207695862049184219L;

    private Object value;

    public IBMPortfolio() {
    }

    public static void println(Object o) {
        System.out.println(o);
    }

    public Object[] getObjectArray() {
        return new Object[]{"A", 3.14, 4};
    }

    public List<Object> getJavaList() {
        List<Object> list = new ArrayList<Object>(3);
        list.add("A");
        list.add(3.14);
        list.add(4);
        return list;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

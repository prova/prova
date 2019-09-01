package org.provarules.kernel2;

public interface ProvaConstant extends ProvaObject {

    Object getObject();

    void setObject(Object object);

    boolean matched(ProvaConstant target);

}

package org.provarules.reference2;

public class ProvaGlobalConstantImpl extends ProvaConstantImpl {

    private static final long serialVersionUID = -6775613881061431962L;

    public static ProvaGlobalConstantImpl create(Object object) {
        return new ProvaGlobalConstantImpl(object);
    }

    private ProvaGlobalConstantImpl(Object object) {
        super(object);
    }

}

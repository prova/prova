package org.provarules.reference2.cache;

public class ProvaTabletKeyImpl {

    private String symbol;

    private int arity;

    private int mask;

    public ProvaTabletKeyImpl(String symbol, int arity, int mask) {
        this.symbol = symbol;
        this.arity = arity;
        this.mask = mask;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ProvaTabletKeyImpl))
            return false;

        ProvaTabletKeyImpl other = (ProvaTabletKeyImpl) o;
        return arity == other.arity && mask == other.mask && symbol.equals(other.symbol);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + arity;
        result = prime * result + mask;
        result = prime * result + symbol.hashCode();
        return result;
    }

    public int getArity() {
        return arity;
    }

    public int getMask() {
        return mask;
    }

    public String getSymbol() {
        return symbol;
    }

}

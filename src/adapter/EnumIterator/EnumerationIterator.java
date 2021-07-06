package adapter.EnumIterator;

import java.util.Enumeration;
import java.util.Iterator;

class EnumerationIterator<E> implements Iterator {
    private Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration enmt){
        this.enumeration = enmt;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }


    public Object next() {
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}

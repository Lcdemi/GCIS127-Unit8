package unit08.mcf;

import java.util.Iterator;

public interface Range extends Iterable<Integer> {
    public int getSize();
    
    public int get(int index);

    public default Iterator<Integer> iterator() {
        throw new UnsupportedOperationException();
    }
}

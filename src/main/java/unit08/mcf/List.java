package unit08.mcf;

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
    public void append(E value);

    public E get(int index);

    public void set(int index, E value);

    public int size();

    @Override
    public default Iterator<E> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}

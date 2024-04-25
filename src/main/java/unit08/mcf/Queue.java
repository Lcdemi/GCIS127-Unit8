package unit08.mcf;

import java.util.Iterator;

public interface Queue<E> extends Iterable<E> {
    public void enqueue(E value);

    public E dequeue();

    public int size();

    default Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}

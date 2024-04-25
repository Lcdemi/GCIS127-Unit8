package unit08.mcf;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private final Object[] elements;
    private int index;
    private final int size;

    public ArrayIterator(Object[] elements, int size) {
        System.out.println("ArrayIterator created: " + size + ", " + Arrays.toString(elements));
        this.elements = elements;
        this.size = size;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        System.out.println("hasNext called: " + (index < size));
        return index < size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E next() {
        E value = (E)elements[index];
        System.out.println("next called: " + value);
        index++;
        return value;
    }
}

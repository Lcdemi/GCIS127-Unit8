package unit08.mcf;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[2];
        this.size = 0;
    }

    @Override
    public Iterator<E> iterator() { 
        return new ArrayIterator<>(elements, size);
    }

    @Override
    public void append(E value) {
        if(this.size == this.elements.length) {
            this.elements = Arrays.copyOf(elements, size * 2);
        }
        this.elements[size++] = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E)elements[index];
    }

    @Override
    public void set(int index, E value) {
        this.elements[index] = value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return size + ", " + Arrays.toString(elements);
    }
}

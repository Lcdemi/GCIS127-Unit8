package unit08.mcf;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private int size;
    private String[] array;

    public ArrayStack() {
        this.array = new String[3];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void push(E value) {
        if(this.size == this.array.length) {
            this.array = Arrays.copyOf(array, size * 2);
        }
        this.array[size++] = (String)value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if(size > 0) {
            String topValue = array[size-1];
            array[size-1] = null;
            size--;
            return (E)topValue;
        } else {
            return (E)"Stack is Empty";
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E top() {
        if(size > 0) {
            return (E)array[size-1];
        } else {
            return (E)"Stack is Empty";
        }
    }

}
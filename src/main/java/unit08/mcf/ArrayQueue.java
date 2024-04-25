package unit08.mcf;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    private Object[] elements;
    private int front;
    private int back;
    private int size;

    public ArrayQueue() {
        this.elements = new Object[4];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(E value) {
        elements[back] = value;
        back = (back + 1) % elements.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E dequeue() {
        E element = (E)elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
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

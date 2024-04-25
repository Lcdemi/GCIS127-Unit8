package unit08.mcf;

import java.util.Iterator;

public class NodeQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> back;
    private int size;

    public NodeQueue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        return size + ", " + front;
    }

    @Override
    public void enqueue(E value) {
        Node<E> newNode = new Node<>(value);
        if(this.size == 0) {
            front = newNode;
            back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E value = front.getValue();
        this.front = front.getNext();

        if(this.front == null) {
            this.back = null;
        }

        size--;
        return (E)value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new NodeIterator<>(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new NodeQueue<>();

        queue.enqueue(123); // auto-boxing: int -> Integer
        queue.enqueue(456);
        queue.enqueue(789);

        int x = queue.dequeue(); //auto-unboxing: Integer -> int
        System.out.println(x);
        Integer y = queue.dequeue();
        System.out.println(y);
    }
}

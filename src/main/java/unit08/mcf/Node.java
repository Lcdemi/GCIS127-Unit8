package unit08.mcf;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value) {
        this.value = value;
        //this.next = null;
    }

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return value + " -> " + next;
    }
}
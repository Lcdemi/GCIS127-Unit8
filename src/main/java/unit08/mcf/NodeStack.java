package unit08.mcf;

public class NodeStack<E> implements Stack<E> {
    private int size;
    private Node<E> top;

    public NodeStack() {
        this.top = null;
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if(top != null) {
            E topValue = top.getValue();
            top = top.getNext();
            size--;
            return topValue;
        } else {
            return (E)"Stack is Empty";
        }
    }

    @Override
    public void push(E value) {
        Node<E> newNode = new Node<>(value, top);
        top = newNode;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E top() {
        if(size > 0) {
            return top.getValue();
        } else {
            return (E)"Stack is Empty";
        }
    } 
}

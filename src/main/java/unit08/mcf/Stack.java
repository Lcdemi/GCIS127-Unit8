package unit08.mcf;

public interface Stack<E> {
    public int size();

    public void push(E value);

    public E pop();

    public E top();
}

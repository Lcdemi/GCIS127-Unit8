package unit08.mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void constructorValue() {
        // setup
        String value = "abc";
        String string = "abc -> null";

        // invoke
        Node<String> node = new Node<>(value);

        // analyze
        assertSame(value, node.getValue());
        assertNull(node.getNext());
        assertEquals(string, node.toString());
    }

    @Test
    public void constructorValueNext() {
        // setup
        String value = "dog";
        Node<String> next = new Node<>("cat");
        String string = "dog -> cat -> null";

        // invoke
        Node<String> node = new Node<>(value, next);

        // analyze
        assertSame(value, node.getValue());
        assertSame(next, node.getNext());
        assertEquals(string, node.toString());
    }

    @Test
    public void setNext() {
        // setup
        Node<String> node = new Node<>("bird");
        Node<String> next = new Node<>("turkey");

        // invoke
        node.setNext(next);

        // analyze
        assertSame(next, node.getNext());
    }
}

package unit08.mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NodeQueueTest {
    @Test
    public void constructor() {
        // setup
        String string = "0, null";

        // invoke
        Queue<String> queue = new NodeQueue<>();

        // analyze
        assertEquals(0, queue.size());
        assertEquals(string, queue.toString());
    }

    @Test
    public void enqueueOne() {
        // setup
        Queue<String> queue = new NodeQueue<>();
        String value = "abc";
        String string = "1, abc -> null";

        // invoke
        queue.enqueue(value);

        // analyze
        assertEquals(1, queue.size());
        assertEquals(string, queue.toString());
    }

    @Test
    public void enqueueTwo() {
        // setup
        Queue<String> queue = new NodeQueue<>();
        queue.enqueue("dog");
        String value = "cat";
        String string = "2, dog -> cat -> null";

        // invoke
        queue.enqueue(value);

        // analyze
        assertEquals(2, queue.size());
        assertEquals(string ,queue.toString());
    }

    @Test
    public void dequeue() {
        // setup
        Queue<String> queue = new NodeQueue<>();
        queue.enqueue("bird");
        queue.enqueue("squirrel");

        // invoke
        String value = queue.dequeue();

        // analyze
        assertEquals(1, queue.size());
        assertEquals("bird", value);
        assertEquals("1, squirrel -> null", queue.toString());
    }

    @Test
    public void dequeueEmpty() {
        // setup
        Queue<String> queue = new NodeQueue<>();
        queue.enqueue("deer");

        // invoke
        String value = queue.dequeue();

        // analyze
        assertEquals(0, queue.size());
        assertEquals("deer", value);
        assertEquals("0, null", queue.toString());
    }
}

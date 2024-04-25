package unit08.mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NodeStackTest {
    @Test
    public void constructor() {
        // setup
        NodeStack<String> stack = new NodeStack<>();

        // invoke
        
        // analyze
        assertEquals(0, stack.size());
    }

    @Test
    public void push() {
        // setup
        NodeStack<String> stack = new NodeStack<>();
        stack.push("cat");
        stack.push("dog");
        stack.push("fish");

        // invoke
        
        // analyze
        assertEquals(3, stack.size());
        assertEquals("fish", stack.top());
    }

    @Test
    public void pushWithResize() {
        // setup
        NodeStack<String> stack = new NodeStack<>();
        stack.push("cat");
        stack.push("dog");
        stack.push("fish");
        stack.push("bird");

        // invoke
        
        // analyze
        assertEquals(4, stack.size());
        assertEquals("bird", stack.top());
    }

    @Test
    public void top() {
        // setup
        NodeStack<String> stack = new NodeStack<>();
        stack.push("cat");
        stack.push("dog");

        // invoke
        
        // analyze
        assertEquals("dog", stack.top());
    }

    @Test
    public void topEmpty() {
        // setup
        NodeStack<String> stack = new NodeStack<>();

        // invoke
        
        // analyze
        assertEquals("Stack is Empty", stack.top());
    }

    @Test
    public void pop() {
        // setup
        NodeStack<String> stack = new NodeStack<>();
        stack.push("cat");
        stack.push("dog");
        stack.push("fish");

        // invoke
        
        // analyze
        assertEquals("fish", stack.pop());
        assertEquals(2, stack.size());
    }

    @Test
    public void popEmpty() {
        // setup
        NodeStack<String> stack = new NodeStack<>();

        // invoke
        
        // analyze
        assertEquals("Stack is Empty", stack.pop());
    }
}

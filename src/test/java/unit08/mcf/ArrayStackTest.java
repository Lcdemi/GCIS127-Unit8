package unit08.mcf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayStackTest {
    @Test
    public void constructor() {
        // setup
        ArrayStack<String> stack = new ArrayStack<>();

        // invoke
        
        // analyze
        assertEquals(0, stack.size());
    }

    @Test
    public void push() {
        // setup
        ArrayStack<String> stack = new ArrayStack<>();
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
        ArrayStack<String> stack = new ArrayStack<>();
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
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("cat");
        stack.push("dog");

        // invoke
        
        // analyze
        assertEquals("dog", stack.top());
    }

    @Test
    public void topEmpty() {
        // setup
        ArrayStack<String> stack = new ArrayStack<>();

        // invoke
        
        // analyze
        assertEquals("Stack is Empty", stack.top());
    }

    @Test
    public void pop() {
        // setup
        ArrayStack<String> stack = new ArrayStack<>();
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
        ArrayStack<String> stack = new ArrayStack<>();

        // invoke
        
        // analyze
        assertEquals("Stack is Empty", stack.pop());
    }
}

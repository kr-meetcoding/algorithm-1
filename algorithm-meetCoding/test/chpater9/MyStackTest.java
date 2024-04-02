package chpater9;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void test() {
        MyStack stack = new MyStack();
        assertTrue(stack.empty());

        stack.push(1);
        assertFalse(stack.empty());
        assertEquals(1, stack.top());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }
}

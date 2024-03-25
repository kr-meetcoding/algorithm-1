package chpater9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    public void validParenthesesTest() {
        String s = "[]{}()";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    public void validParenthesesTest2() {
        String s = "]})";
        assertFalse(ValidParentheses.isValid(s));
    }

    @Test
    public void validParenthesesTest3() {
        String s = "()(]{}[)";
        assertFalse(ValidParentheses.isValid(s));
    }
}
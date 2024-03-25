package chpater9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParentheses2Test {
    @Test
    public void validParenthesesTest() {
        String s = "[]{}()";
        assertTrue(ValidParentheses2.isValid(s));
    }

    @Test
    public void validParenthesesTest2() {
        String s = "]})";
        assertFalse(ValidParentheses2.isValid(s));
    }

    @Test
    public void validParenthesesTest3() {
        String s = "()(]{}[)";
        assertFalse(ValidParentheses2.isValid(s));
    }

    @Test
    public void validParenthesesTest4() {
        String s = "";
        assertTrue(ValidParentheses2.isValid(s));
    }
}
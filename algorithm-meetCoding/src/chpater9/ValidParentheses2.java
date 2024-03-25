package chpater9;

import java.util.ArrayDeque;

public class ValidParentheses2 {
    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.addLast(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') stack.addLast(s.charAt(i));
            else if (s.charAt(i) == ']' && stack.getLast() == '[') stack.removeLast();
            else if (s.charAt(i) == '}' && stack.getLast() == '{') stack.removeLast();
            else if (s.charAt(i) == ')' && stack.getLast() == '(') stack.removeLast();
        }
        return stack.isEmpty();
    }
}

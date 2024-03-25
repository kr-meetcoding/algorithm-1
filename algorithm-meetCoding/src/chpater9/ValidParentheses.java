package chpater9;

import java.util.ArrayDeque;

// 문제 : 대중소 세 종류 괄호로 된 입력값이 유효한지 판별하라.
// 입력 : []{}()
// 출력 : true
// [{()()}]
public class ValidParentheses {
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

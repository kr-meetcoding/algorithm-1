package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class 유효한괄호 {

    class Solution {
        public boolean isValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');

            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == '(' || temp == '{' || temp == '[') {
                    stack.push(temp);
                } else if (stack.isEmpty()) {
                    return false;
                } else if (map.get(temp) != stack.pop()) {
                    return false;
                }
            }

            if (stack.size() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}

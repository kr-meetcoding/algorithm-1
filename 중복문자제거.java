package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class 중복문자제거 {
    class Solution {
        public static String removeDuplicateLetters(String s) {
            Map<Character, Integer> count = new HashMap<>();
            Map<Character, Boolean> check = new HashMap<>();
            Deque<Character> stack = new ArrayDeque<>();

            for (char c : s.toCharArray()) { // N
                count.put(c, count.get(c) == null ? 1 : count.get(c) + 1);
            }

            for (char c : s.toCharArray()) { // N
                count.put(c, count.get(c) - 1); // 사용처리

                if (check.get(c) != null && check.get(c) == true) { // 처리했음 건너뜀
                    continue;
                }

                while (true) {
                    if (!stack.isEmpty()) { //
                        char peek = stack.peek();
                        if (peek > c && count.get(peek) > 0){
                            check.put(stack.pop(),false);
                        } else{
                            break;
                        }
                    }else {
                        break;
                    }
                }
                stack.push(c);
                check.put(c,true);
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()){
                sb.append(stack.pollLast());
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.removeDuplicateLetters("cbacdcbc"));
        System.out.println(Solution.removeDuplicateLetters("bcabc"));
        System.out.println(Solution.removeDuplicateLetters("abadbc"));
    }
}

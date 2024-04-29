import java.util.ArrayList;
import java.util.List;

public class 전화번호문자조합 {


    class Solution {
        static List<List<Character>> phone = new ArrayList<>();

        public static List<String> letterCombinations(String digits) {
            phone.add(List.of());
            phone.add(List.of());
            phone.add(List.of('a', 'b', 'c'));
            phone.add(List.of('d', 'e', 'f'));
            phone.add(List.of('g', 'h', 'i'));
            phone.add(List.of('j', 'k', 'l'));
            phone.add(List.of('m', 'n', 'o'));
            phone.add(List.of('p', 'q', 'r', 's'));
            phone.add(List.of('t', 'u', 'v'));
            phone.add(List.of('w', 'x', 'y', 'z'));
            List<String> res = new ArrayList<>();

            if (digits.isEmpty()) { // vaildation
                return res;
            }

            dfs(res, digits, 0, new StringBuilder());
            return res;
        }

        private static void dfs(List<String> res, String digits, int i, StringBuilder sb) {
            if (sb.length() == digits.length() || i == digits.length()) {
                res.add(String.valueOf(sb));
                return;
            }

            int index = digits.charAt(i) - 48;

            for (int j = 0; j < phone.get(index).size(); j++) {
                Character c = phone.get(index).get(j);
                dfs(res, digits, i + 1, new StringBuilder(sb).append(c));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.letterCombinations("23"));
    }
}

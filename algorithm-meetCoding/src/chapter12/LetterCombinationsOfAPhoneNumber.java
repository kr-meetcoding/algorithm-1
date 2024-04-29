package chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    private static void dfs(List<String> result, Map<Character, List<Character>> phonePad, String digits, int index,
                            StringBuilder path) {
        if (digits.length() == path.length()) {
            result.add(String.valueOf(path));
            return;
        }

        for (Character c : phonePad.get(digits.charAt(index))) {
            dfs(result, phonePad, digits, index + 1, new StringBuilder(path).append(c));
        }
    }

    public static List<String> letterCombinationsOfAPhoneNumber(String digits) {
        if (digits.isEmpty()) {
            return null;
        }

        List<String> res = new ArrayList<>();
        Map<Character, List<Character>> dict = Map.of(
                '0', List.of(),
                '1', List.of(),
                '2', List.of('a', 'b', 'c'),
                '3', List.of('d', 'e', 'f'),
                '4', List.of('g', 'h', 'i'),
                '5', List.of('j', 'k', 'l'),
                '6', List.of('m', 'n', 'o'),
                '7', List.of('p', 'q', 'r', 's'),
                '8', List.of('t', 'u', 'v'),
                '9', List.of('w', 'x', 'y', 'z')
        );

        dfs(res, dict, digits, 0, new StringBuilder());
        return res;
    }

    public static void main(String[] args) {
        String digits = "24"; // 테스트할 숫자 조합
        System.out.println(LetterCombinationsOfAPhoneNumber.letterCombinationsOfAPhoneNumber(digits));
    }

}
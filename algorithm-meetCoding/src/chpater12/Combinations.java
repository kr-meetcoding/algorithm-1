package chpater12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {

    public static void dfs(List<List<Integer>> results, LinkedList<Integer> elements, int n, int start, int k) {
        if (k == 0) {
            results.add(new ArrayList<>(elements));
            return;
        }

        for (int i = start; i <= n; i++) {
            elements.add(i);
            dfs(results, elements, n, i + 1, k - 1);
            elements.removeLast();
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new LinkedList<>(), n, 1, k);

        return results;
    }

    public static void main(String[] args) {
        System.out.println(combine(5, 3));
    }

}

package chpater12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void dfs(List<List<Integer>> results, List<Integer> preElements, List<Integer> elements) {
        if (elements.isEmpty()) {
            results.add(new ArrayList<>(preElements));
        }
        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            preElements.add(e);
            dfs(results, preElements, nextElements);
            preElements.remove(e);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> lst = Arrays.stream(nums).boxed().toList();
        dfs(results, new ArrayList<>(), lst);
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        System.out.println(permute(nums));
    }
}

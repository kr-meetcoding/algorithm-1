package oeyh.chap12;
import java.util.*;
import java.util.ArrayList;

public class combination_sum {
    static List<List<Integer>> answer = new ArrayList<>();

    public static void dfs(int prev, int[] candidates, int target, List<Integer> nums){
        int total = 0;

        for(int i = 0; i < nums.size(); i++){
            total += nums.get(i);
        }

        if(total == target){
            answer.add(new ArrayList<>(nums));
            return;
        }

        else if(total > target){
            return;
        }

        else{
            for(int i = prev; i < candidates.length; i++){
                nums.add(candidates[i]);
                dfs(i, candidates, target, nums);
                nums.remove(nums.size() - 1);
            }
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target, new ArrayList<>());

        return answer;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = combination_sum.combinationSum(candidates, target);

        for(int i =0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}

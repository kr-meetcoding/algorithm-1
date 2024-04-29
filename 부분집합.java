import java.util.ArrayList;
import java.util.List;

public class 부분집합 {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            dfs(res, nums, 0, new ArrayList<>());
            return res;
        }

        private void dfs(List<List<Integer>> res, int[] nums, int index, List<Integer> list) {
            res.add(new ArrayList<>(list));

            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                dfs(res, nums, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}

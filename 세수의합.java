import java.util.*;

public class 세수의합 {

    class Solution {
        public static List<List<Integer>> threeSum(int[] nums) { // N^2
            Set<List<Integer>> result = new HashSet<>();

            /*
            투포인터
             */

            Arrays.sort(nums); // NlogN
            for (int i = 0; i < nums.length - 2; i++) { // N
                int frist = nums[i];
                int zero = 0;

                int leftIndex = i + 1;
                int rightIndex = nums.length - 1;
                while (leftIndex < rightIndex) { // N
                    if (frist + nums[leftIndex] + nums[rightIndex] > zero) {
                        rightIndex--;
                        continue;
                    }
                    if (frist + nums[leftIndex] + nums[rightIndex] < zero) {
                        leftIndex++;
                        continue;
                    }
                    if (frist + nums[leftIndex] + nums[rightIndex] == zero) {
                        result.add(Arrays.asList(nums[i], nums[leftIndex], nums[rightIndex]));
                        leftIndex++;
                        rightIndex--;
                        continue;
                    }
                }
            }


            return new ArrayList<>(result);
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{-1, 0, 1, 2, -1, -4};
        Solution.threeSum(input1).stream().forEach(list -> {
            list.stream().forEach(integer -> {
                System.out.print(integer + ",");
            });
            System.out.println(" ");
        });
    }
}

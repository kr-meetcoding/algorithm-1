import java.util.*;

public class 배열파티션I {

    class Solution {
        public static int arrayPairSum(int[] nums) {
            int result = 0;
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 1; i++) { // N
                if (i % 2 == 0) {
                    result += nums[i];
                }
                if (i % 2 == 1) {
                    continue;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 4, 3, 2};
        System.out.println(Solution.arrayPairSum(input1));

        int[] input2 = new int[]{6, 2, 6, 5, 1, 2};
        System.out.println(Solution.arrayPairSum(input2));
    }
}

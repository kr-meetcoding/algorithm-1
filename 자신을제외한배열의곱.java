import java.util.Arrays;

public class 자신을제외한배열의곱 {
    class Solution {
        public static int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];

            // 일단 N으로 끝내야한다.. 정렬은 의미없고
            result[0] = 1;
            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            int rightBase = 1;
            for (int i = nums.length - 2; i > -1; i--) {
                rightBase = rightBase * nums[i + 1];
                result[i] *= rightBase;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 4};
        Arrays.stream(Solution.productExceptSelf(input1)).forEach(i -> {
            System.out.print(i + " ");
        });
    }
}

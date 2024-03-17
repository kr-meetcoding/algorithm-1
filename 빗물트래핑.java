import java.util.Arrays;

public class 빗물트래핑 {
    class Solution { // 브루트포스 같은데,,, 투포인트는 아님
        public static int trap(int[] height) {
            int res = 0;

            int maxIndex = 0;
            int max = height[0];
            for (int i = 1; i < height.length; i++) { // 최대값찾기 O(N)
                if (max < height[i]) {
                    max = height[i];
                    maxIndex = i;
                }
            }

            for (int i = 0; i <= maxIndex; i++) { // N^2으로 보이나 N
                int temp = 0;
                for (int j = i + 1; j <= maxIndex; j++) {
                    if (height[i] <= height[j]) {
                        res += temp;
                        i = j - 1; // 이부분때문에 사실상 N
                        break;
                    } else {
                        temp += height[i] - height[j];
                    }
                }
            }

            for (int i = height.length-1; i >= maxIndex; i--) { // N^2으로 보이나 N
                int temp = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (height[j] >= height[i]) {
                        res += temp;
                        i = j + 1; // 이부분때문에 사실상 N
                        break;
                    } else {
                        temp += height[i] - height[j];
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(Solution.trap(input));

        int[] input2 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(Solution.trap(input2));
    }
}

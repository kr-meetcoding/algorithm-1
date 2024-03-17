import java.util.Arrays;
import java.util.Comparator;

public class 두수의합 {
    static class Solution1 { //브루트 포스 O(N^2)
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }
    }

    static class Solution2 { //
        static class IndexInt {
            int index;
            int value;

            public IndexInt(int index, int value) {
                this.index = index;
                this.value = value;
            }
        }

        public static int[] twoSum(int[] nums, int target) { // 투포인트 O(NlogN)
            IndexInt[] sortNums = new IndexInt[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sortNums[i] = new IndexInt(i, nums[i]);
            }
            Arrays.sort(sortNums, Comparator.comparingInt(num -> num.value)); // O(NlogN)

            int left = 0;
            int right = nums.length - 1;

            while (left < right) { // O(N)
                int temp = sortNums[left].value + sortNums[right].value;
                if (temp == target) { // 정답
                    return new int[]{sortNums[left].index, sortNums[right].index};
                }
                if (temp < target) {
                    left++;
                }
                if (temp > target) {
                    right--;
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int target = 6;
        Arrays.stream(Solution1.twoSum(nums, target)).forEach(i -> {
            System.out.println(i);
        });
        Arrays.stream(Solution2.twoSum(nums, target)).forEach(i -> {
            System.out.println(i);
        });

    }
}

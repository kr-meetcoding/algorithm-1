package Khjin06k.chap7;
import java.util.*;

// 덧셈하여 타깃을 만들 수 있는 배열의 두 숫자 인덱스를 리턴하라.
// 입력 : nums = [2,6,11,15]; 출력 : [0, 1]

public class 두수의_합 {

    static class MySolution{

        public static int[] twoSum(int[] nums, int target) {
            int[] answer = {};

            for(int i = 0; i<nums.length; i++){
                for(int j = i+1; j<nums.length; j++){
                    if(nums[i] + nums[j] == target) answer = new int[]{i, j};
                }
            }

            return answer;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,6,11,15};
        int target = 8;

        System.out.println(Arrays.toString(MySolution.twoSum(nums, target)));
    }
}

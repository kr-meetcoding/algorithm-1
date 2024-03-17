package Khjin06k.chap7;

import java.util.Arrays;

// n개의 페어를 이용한 min(a, b)의 합으로 만들 수 있는 가장 큰 수를 출력하라
// 입력 : [1, 3, 4, 2]
// 출력 : 4
public class 배열_파티션 {
    static class MySolution {
        public static int arraySolution(int[] nums) {
            int answer = 0;

            // 가장 작은 수끼리의 min을 설정할 경우 가장 큰 수를 출력할 수 있음
            // 정렬한 nums를 받아와 min을 찾아 더함
            for (int i = 0; i < nums.length; i += 2) {
                answer += Math.min(nums[i], nums[i + 1]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};

        Arrays.sort(nums);

        System.out.println(MySolution.arraySolution(nums));
    }
}


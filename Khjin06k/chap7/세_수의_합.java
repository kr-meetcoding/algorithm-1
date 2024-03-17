package Khjin06k.chap7;

// 배열을 입력받아 합으로 0을 만들 수 있는 3개의 엘리먼트를 출력하라.
// 입력 nums = [-1, 0, 1, 2, -1, -5]
// 출력 [[-1, 0, 1], [-1, -1, 2]]

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 세_수의_합 {

    static class MySolution{
        public static int[][] three3Sum(int[] nums){
            List<int[]> list = new ArrayList<>();

            // 정렬한 nums를 받아와 앞에서부터 확인 진행 >> 중복이 있을 경우 pass
            for(int i = 0; i<nums.length; i++){
                if(i>0 && nums[i] == nums[i-1]) continue;
                for(int j = i+1; j<nums.length; j++){
                    if(j > i+1 && nums[j] == nums[j-1]) continue;
                    for (int k = j + 1; k < nums.length; k++) {
                        if(k>j+1 && nums[k] == nums[k-1]) continue;
                        if(nums[i]+nums[j]+nums[k] == 0) list.add(new int[]{nums[i], nums[j], nums[k]});
                    }
                }
            }

            int[][] answer = new int[list.size()][3];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -5};

        Arrays.sort(nums);
        // 1차원 배열의 경우 Arrays.toString, 2차원 배열의 경우 Arrays.deepToString
        System.out.println(Arrays.deepToString(MySolution.three3Sum(nums)));
    }
}

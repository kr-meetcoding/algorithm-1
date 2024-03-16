package Khjin06k.chap7;

import java.util.ArrayList;
import java.util.List;

public class 주식을_사고팔기_가장_좋은_시점 {
    static class MySolution{
        public static int bestTimeToBuyAndSellStock(int[] nums){
            int answer = 0;

            // 최저값의 인덱스와 최대값을 저장할 변수 지정
            int minIdx = 0;
            int max = 0;

            for(int i = 1; i<nums.length; i++){
                // 최소값의 경우 인덱스를 변경
                if(nums[i] < nums[minIdx]) {
                    minIdx = i;
                }
                // 최대값이 최소값보다 뒤에 있기 위한 최대값 지정 조건
                if(nums[i] > max && i > minIdx) max = nums[i];
            }

            answer = max - nums[minIdx];
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 1, 5, 3, 6, 4};

        System.out.println(MySolution.bestTimeToBuyAndSellStock(nums));
    }
}

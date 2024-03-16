package Khjin06k.chap7;
import java.util.*;

// 높이를 입력 받아 비온 후 얼마나 많은 물이 쌓일 수 있는지 계산하라.
// 입력 : [ 1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 ] / 출력 : 6

public class 빗물_트래핑 {
    static class MySolution{
        public static int trappingRain(int[] height){
            int answer = 0;

            int left = 0;
            int right = height.length-1;

            int leftMax = height[left];
            int rightMax = height[right];

            while(left < right){
                if(leftMax < height[left]) leftMax = height[left];
                else if(rightMax < height[right]) rightMax = height[right];
                else {
                    if (leftMax <= rightMax) {
                        answer += Math.abs(height[left] - leftMax);
                        left++;
                    } else {
                        answer += Math.abs(height[right] - rightMax);
                        right--;
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] height = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(MySolution.trappingRain(height));
    }
}

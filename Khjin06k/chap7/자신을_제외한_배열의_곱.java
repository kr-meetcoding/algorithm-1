package Khjin06k.chap7;

import java.util.Arrays;
import java.util.Iterator;

import static java.util.Arrays.stream;

// 배열을 입력받아 output[i]가 자신을 제외한 나머지 모든 엘리먼트의 곱셈 결과가 되도록 출력하라
// 입력 : [1, 3, 5, 7]
// 출력 : [105, 35, 21, 15]
public class 자신을_제외한_배열의_곱 {
    static class MySolution {
        public static int[] arrayExceptSelf(int[] nums) {
            int[] answer = new int[nums.length];

            for(int i = 0; i<nums.length; i++){
                int multi = 1;
                int finalI = nums[i];

                // i번째의 원소가 아닌 것을 filter해서 Iterator에 저장
                Iterator<Integer> answeri = Arrays.stream(nums)
                        .filter(x -> x != finalI)
                        .iterator();

                // 곱해야 하는 숫자를 모두 곱함
                while(answeri.hasNext()) multi *= answeri.next();

                answer[i] = multi;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};

        System.out.println(Arrays.toString(MySolution.arrayExceptSelf(nums)));
    }
}

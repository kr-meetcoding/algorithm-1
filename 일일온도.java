package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 일일온도 {
    class Solution {
        public static int[] dailyTemperatures(int[] temperatures) {
            int[] result = new int[temperatures.length];
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < temperatures.length; i++) { // N
                while (!stack.isEmpty()) {
                    if (temperatures[i] > temperatures[stack.peek()]) {
                        int top = stack.pop();
                        result[top] = i - top;
                    } else {
                        break;
                    }
                }
                stack.push(i);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{73,74,75,71,69,72,76,73};
        Arrays.stream(Solution.dailyTemperatures(input1)).forEach(i ->{
            System.out.print(i+ " ");
        });
        System.out.println(" ");
        int[] input2 = new int[]{30,40,50,60};
        Arrays.stream(Solution.dailyTemperatures(input2)).forEach(i ->{
            System.out.print(i+ " ");
        });
    }
}

package chpater9;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.getLast()]) {
                int last = stack.removeLast();
                result[last] = i - last;
            }
            stack.addLast(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{23, 24, 25, 21, 19, 22, 26, 23})));
    }
}


public class 주식을살고팔기가장좋은시점 {
    class Solution {
        public static int maxProfit(int[] prices) { //O(N)
            int result = 0; //maxProfit
            int preMinPrice = prices[0];

            for (int price : prices) { // N
                preMinPrice = Math.min(preMinPrice, price);
                result = Math.max(result, price - preMinPrice);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(Solution.maxProfit(input1));
        int[] input2 = new int[]{7, 6, 4, 3, 1};
        System.out.println(Solution.maxProfit(input2));
    }
}

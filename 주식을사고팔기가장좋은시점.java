class Solution {
    public int maxProfit(int[] prices) {
            
            int minPrice = prices[0]; //최소값
            int maxProfit = 0; //최대이익

        for(int price:prices){ //가격대 순회
            
            if(minPrice < price){ //최소가격보다 높으면
               maxProfit = Math.max(maxProfit, price-minPrice); //최대이익을 산출          
            }else{               //최소가격일 시 
               minPrice = price; //최소가격 설정
            }          
        }
        
        return maxProfit;

    }
}

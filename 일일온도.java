class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] result = new int[temperatures.length];        
        Deque<Integer> Stack = new ArrayDeque<>();
        
        for(int i= 0; i < temperatures.length; i++){
          //더 높은 온도가 발견될 때 차이분 입력 
         while(!Stack.isEmpty() && temperatures[i] > temperatures[Stack.peek()]){
             int last = Stack.pop();
             result[last] = i - last;
         }
             Stack.push(i);            
        }
       return result;
    }
       
}

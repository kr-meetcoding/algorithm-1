class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);//정렬

        int sum = 0; //합계 
        int index =0;
        for(int even: nums ){  //짝수번마다 합계 더하기   
            if(index%2==0){
                sum+=even;
            }
            index++;
        }
        
        return sum;
    }
}

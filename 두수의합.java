class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       int len = nums.length; //input 배열의 길이

       Map<Integer, Integer> numMap = new HashMap<>(); //효율성을위해 Hashmap 생성

       for(int i = 0 ; i < len ; i++){ // 배열을 돌면서
                                 
            int FirstAnswer = target - nums[i]; //정답 2개중 1개는 target - 현재값
                        
            if(numMap.containsKey(FirstAnswer)) {//Hashmap 키가 정답을 가지고 있으면
                return new int[] {numMap.get(FirstAnswer), i}; //정답과 현재위치 리턴
            }
            
             numMap.put(nums[i], i); //Hashmap 키 부분에 값을 넣고, 값부분에 키를 넣는다.(firstAnswer 후보 생성)

       }
        

        return null; //메소드 null처리
    }
}

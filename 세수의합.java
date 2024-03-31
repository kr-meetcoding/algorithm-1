class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> tempResults = new HashSet<>(); //중복제거용 Set 리턴값 생성

        //투포인터와 순회 활용
        int left = 0;
        int right = 0;
        int sum = 0;  //합계체크

        Arrays.sort(nums);//input값 정렬

            for(int i =0 ;i<nums.length-2;i++){ //nums순회
                
                if(i>0 && nums[i]==nums[i-1]){ //중복제거
                    continue;
                }
                
                left = i+1;
                right = nums.length-1;

                while(left < right){              
                  sum = nums[i] + nums[left]+nums[right];  //합계

                 if(sum<0){ //0보다작으면
                     left++;
                 }else if(sum>0){ //0보다 크면
                     right--;
                 }else{ //정답이면
                    tempResults.add(Arrays.asList(nums[i],nums[left],nums[right]));  
                    left++;
                    right--;
                }
            }
        }
        
        List<List<Integer>> results= new ArrayList<List<Integer>>(tempResults);//함수리턴값 생성
        return results; //결과값 리턴

    }
}

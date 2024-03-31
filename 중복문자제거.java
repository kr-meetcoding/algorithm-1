class Solution {
       
    
    public String removeDuplicateLetters(String s) {
                
        Map<Character , Integer> counter = new HashMap<>();
        Map<Character , Boolean> seen = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        
        //문자별 개수 개산
        for(char c: s.toCharArray()){
            counter.put(c, counter.get(c) == null? 1: counter.get(c)+1);
        }
                
        for(char c :  s.toCharArray()){            
            counter.put(c, counter.get(c) -1);            
            //이미 처리한 문자 건너뜀 
            if(seen.get(c) != null && seen.get(c) ==true){
                continue;
            }            
            //스택에 있는 문자가 현재보다 뒤에올 문자면 스택에서 제거 
            while(!stack.isEmpty() && stack.peek() > c && counter.get(stack.peek()) >0){
                seen.put(stack.pop(),false);
            }            
            //현재문자 스택에 입력 
            stack.push(c);
            seen.put(c,true);            
        }
        
        //출력
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
             sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
}

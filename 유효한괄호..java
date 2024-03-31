class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        //검증용 map 생성
        Map<Character,Character> table = new HashMap<>(){
            {
             put(')','(');
             put('}','{');
             put(']','[');
            }
        };
        
        //stack 대조 
        for(int i = 0; i< s.length(); i++){            
            if(!table.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(stack.isEmpty()||table.get(s.charAt(i))!= stack.pop()){
                return false;
            }               
        }
        
        return stack.size() ==0;
    }
}

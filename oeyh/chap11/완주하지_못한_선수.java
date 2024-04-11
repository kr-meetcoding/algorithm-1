package oeyh.chap11;
import java.util.*;
public class 완주하지_못한_선수 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String, Integer> map = new HashMap<>();
            String answer = "";
            for(String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);
            for(String c : completion) map.put(c, map.get(c) - 1);

            for(String key : map.keySet()){
                if(map.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }
    }
}

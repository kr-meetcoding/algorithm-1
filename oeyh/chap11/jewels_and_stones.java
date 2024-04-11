package oeyh.chap11;
import java.util.*;
public class jewels_and_stones {
    class MapSolution {
        public int numJewelsInStones(String jewels, String stones) {
            int answer = 0;
            Map<Character, Integer> map = new HashMap<>();
            for(char stone : stones.toCharArray()){
                map.put(stone, map.getOrDefault(stone, 0) + 1);
            }

            for(char jewel : jewels.toCharArray()){
                if(map.containsKey(jewel))
                    answer += map.get(jewel);
            }

            return answer;
        }
    }

    class SetSolution {
        public int numJewelsInStones(String jewels, String stones) {
            int count = 0;
            Set<Character> set = new HashSet<>();

            for(char jewel: jewels.toCharArray()){
                set.add(jewel);
            }

            for(char stone : stones.toCharArray()){
                if(set.contains(stone))
                    count++;
            }

            return count;
        }
    }
}

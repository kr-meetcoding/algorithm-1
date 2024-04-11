package oeyh.chap11;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(3, 30);
        map.put(2, 20);
        map.put(4, 40);

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        for (int key : keySet){
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}

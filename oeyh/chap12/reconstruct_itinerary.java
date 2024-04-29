package oeyh.chap12;
import java.util.*;
import java.util.ArrayList;

public class reconstruct_itinerary {
    public void dfs(List<String> result, Map<String, PriorityQueue<String>> map, String now){

        while(map.containsKey(now) && !map.get(now).isEmpty()){
            PriorityQueue<String> pq = map.get(now);
            String dest = pq.poll();
            dfs(result, map, dest);
        }

        result.add(0, now);

    }

    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        Map<String, PriorityQueue<String>> map = new HashMap<>();

        for(List<String> ticket : tickets){
            String src = ticket.get(0);
            String dest = ticket.get(1);

            map.putIfAbsent(src, new PriorityQueue<String>());
            map.get(src).add(dest);
        }
        dfs(result, map, "JFK");
        return result;
    }
}

package chapter14;

import java.util.*;

public class MinimumHeightTrees {
    public static List<Integer> solution(int n, int[][] edges) {
        if (n == 1) return List.of(0);

        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new HashSet<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1) queue.add(i);
        }

        int remain = n;
        while (remain > 2) {
            int size = queue.size();
            remain -= size;

            for (int i = 0; i < size; ++i) {
                int u = queue.poll();
                int v = graph.get(u).iterator().next();

                graph.get(v).remove(u);

                if (graph.get(v).size() == 1) queue.offer(v);
            }
        }

        return new ArrayList<>(queue);
    }
}

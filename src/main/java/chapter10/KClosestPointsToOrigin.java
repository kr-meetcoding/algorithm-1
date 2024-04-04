package chapter10;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static int[][] solution(int[][] points, int k) {
        if (points == null || points.length == 0 || k <= 0) return null;

        PriorityQueue<Map<String, Object>> queue = new PriorityQueue<>(Comparator.comparingLong(m -> (long) m.get("distance")));

        for (int[] point : points) {
            Long distance = (long) point[0] * point[0] + (long) point[1] * point[1];
            queue.add(Map.of("point", point, "distance", distance));
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = (int[]) Objects.requireNonNull(queue.poll()).get("point");
        }

        return res;
    }
}

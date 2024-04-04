package chapter10;

import java.util.*;

public class KClosestPointsToOrigin {
    public static int[][] solution(int[][] points, int k) {
        return Arrays.stream(points)
                .sorted(Comparator.comparingLong(point -> (long) point[0] * point[0] + (long) point[1] * point[1]))
                .limit(k)
                .toArray(int[][]::new);
    }
}

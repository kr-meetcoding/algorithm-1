package deque;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 원점에서가장가까운k개의점 {


    class Solution {
        static class Point {
            double distance;
            int[] point;

            public Point(double distance, int[] point) {
                this.distance = distance;
                this.point = point;
            }
        }

        public static int[][] kClosest(int[][] points, int k) {
            int[][] result = new int[k][];

            PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> {
                return a.distance;
            }));

            for (int[] point : points) {
                double distance = Math.sqrt((long) point[0] * point[0] + (long) point[1] * point[1]);
                pq.add(new Point(distance, point));
            }

            for (int i = 0; i < k; i++) {
                result[i] = pq.poll().point;
            }
            return result;
        }

    }

    public static void main(String[] args) {
        int[][] points = new int[][]{new int[]{1, 3}, new int[]{-2, 2}};
        int k = 1;

        Arrays.stream(Solution.kClosest(points, k)).forEach(intArray -> {
                    System.out.print("{");
                    Arrays.stream(intArray).forEach(i -> {
                        System.out.print(i + " ");
                    });
                    System.out.print("},");
                }
        );
    }
}

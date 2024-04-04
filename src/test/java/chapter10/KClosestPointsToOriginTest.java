package chapter10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KClosestPointsToOriginTest {
    @Test
    public void test() {
        int[][] input = {{3, 3}, {6, -1}, {-2, 4}};
        int[][] answer = {{3, 3}, {-2, 4}};

        Assertions.assertArrayEquals(KClosestPointsToOrigin.solution(input, 2), answer);
    }
}

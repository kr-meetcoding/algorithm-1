package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinimumHeightTreesTest {
    @Test
    public void test() {
        int[][] input1 = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 3}, {6, 5}};
        int[][] input2 = {{0, 2}, {1, 2}, {2, 3}, {2, 4}, {3, 5}, {5, 9}, {4, 6}, {4, 7}, {7, 8}};

        Assertions.assertEquals(MinimumHeightTrees.solution(7, input1), List.of(3, 5));
        Assertions.assertEquals(MinimumHeightTrees.solution(10, input2), List.of(2));
    }
}

package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestUnivaluePathTest {
    @Test
    public void test() {
        Assertions.assertEquals(LongestUnivaluePath.solution(TreeNode.of(new Integer[]{3, 4, 3, 1, 1, 3})), 2);
        Assertions.assertEquals(LongestUnivaluePath.solution(TreeNode.of(new Integer[]{1, 6, 5, 6, 6, 5})), 2);
    }
}

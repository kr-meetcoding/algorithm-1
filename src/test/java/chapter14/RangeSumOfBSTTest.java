package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumOfBSTTest {
    @Test
    public void test() {
        TreeNode<Integer> input = TreeNode.of(new Integer[]{10, 5, 15, 3, 6, null, 18});
        Assertions.assertEquals(RangeSumOfBST.solution(input, 6, 15), 31);
    }
}

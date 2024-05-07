package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void test() {
        TreeNode<Integer> input = TreeNode.of(new Integer[]{3, 9, 10, null, null, 15, 17}, 0);
        Assertions.assertEquals(MaximumDepthOfBinaryTree.solution(input), 3);
    }
}

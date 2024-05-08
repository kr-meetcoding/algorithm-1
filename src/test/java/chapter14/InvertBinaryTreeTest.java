package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {
    @Test
    public void test() {
        TreeNode<Integer> input = TreeNode.of(new Integer[]{4, 5, 7, 1, 3, 6, 9});
        TreeNode<Integer> answer = TreeNode.of(new Integer[]{4, 7, 5, 9, 6, 3, 1});
        Assertions.assertEquals(answer, InvertBinaryTree.solution(input));
    }
}

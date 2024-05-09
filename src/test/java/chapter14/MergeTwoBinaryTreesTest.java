package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoBinaryTreesTest {
    @Test
    public void test() {
        TreeNode<Integer> input1 = TreeNode.of(new Integer[]{1, 4, 2, 5});
        TreeNode<Integer> input2 = TreeNode.of(new Integer[]{2, 1, 3, null, 4, null, 7});
        TreeNode<Integer> answer = TreeNode.of(new Integer[]{3, 5, 5, 5, 4, null, 7});
        Assertions.assertEquals(answer, MergeTwoBinaryTrees.solution(input1, input2));
    }
}

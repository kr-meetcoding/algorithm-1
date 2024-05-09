package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SerializeAndDeserializeBinaryTreeTest {
    @Test
    public void test() {
        Integer[] arr = {1, 2, 3, 4, null, null, 5};
        Assertions.assertArrayEquals(arr, SerializeAndDeserializeBinaryTree.solution(TreeNode.of(arr)));
    }
}

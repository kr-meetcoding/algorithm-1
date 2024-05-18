package chapter14;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public static Integer[] solution(TreeNode<Integer> root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return null;

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> node = queue.poll();
            if (node == null) {
                list.add(null);
            } else {
                list.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        while (!list.isEmpty() && list.get(list.size() - 1) == null) {
            list.remove(list.size() - 1);
        }

        return list.toArray(new Integer[0]);
    }
}

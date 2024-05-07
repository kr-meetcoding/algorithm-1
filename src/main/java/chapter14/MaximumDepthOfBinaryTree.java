package chapter14;

public class MaximumDepthOfBinaryTree {
    public static int solution(TreeNode<Integer> root) {
        if (root == null) return 0;

        int left = solution(root.left);
        int right = solution(root.right);

        return Math.max(left, right) + 1;
    }
}

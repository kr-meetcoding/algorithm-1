package chapter14;

public class InvertBinaryTree {
    public static TreeNode<Integer> solution(TreeNode<Integer> root) {
        if (root == null) return null;

        TreeNode<Integer> tn = new TreeNode<>(root.val);
        tn.left = solution(root.right);
        tn.right = solution(root.left);

        return tn;
    }
}

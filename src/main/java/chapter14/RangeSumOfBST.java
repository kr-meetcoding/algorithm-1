package chapter14;

public class RangeSumOfBST {
    public static int solution(TreeNode<Integer> root, int low, int high) {
        if (root == null) return 0;

        if (root.val > high) return solution(root.left, low, high);
        if (root.val < low) return solution(root.right, low, high);

        return root.val + solution(root.left, low, high) + solution(root.right, low, high);
    }
}

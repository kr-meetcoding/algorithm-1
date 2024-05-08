package chapter14;

public class LongestUnivaluePath {
    private static int res = 0;

    private static int dfs(TreeNode<Integer> node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (node.left != null && node.val.equals(node.left.val)) {
            left += 1;
        } else {
            left = 0;
        }

        if (node.right != null && node.val.equals(node.right.val)) {
            right += 1;
        } else {
            right = 0;
        }

        res = Math.max(res, left + right);

        return Math.max(left, right);
    }

    public static int solution(TreeNode<Integer> root) {
        dfs(root);
        return res;
    }
}

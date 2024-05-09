package chapter14;

public class MergeTwoBinaryTrees {
    public static TreeNode<Integer> solution(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode<Integer> res = new TreeNode<>(root1.val + root2.val);
        res.left = solution(root1.left, root2.left);
        res.right = solution(root1.right, root2.right);
        
        return res;
    }
}

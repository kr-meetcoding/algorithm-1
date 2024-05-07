package chapter14;

public class TreeNode<T> {
    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T val) {
        this.val = val;
    }

    TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static <T> TreeNode<T> of(T[] arr) {
        return of(arr, 0);
    }

    private static <T> TreeNode<T> of(T[] arr, int i) {
        if (i >= arr.length) return null;

        T value = arr[i];
        if (value == null) return null;

        TreeNode<T> root = new TreeNode<>(value);

        root.left = of(arr, 2 * i + 1);
        root.right = of(arr, 2 * i + 2);

        return root;
    }
}

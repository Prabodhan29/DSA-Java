package com.BinarySearchTree;

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValid(root, null, null)); // true
    }

    public static boolean isValid(TreeNode root, Integer min_limit, Integer max_limit) {
        // base condition
        if(root == null) return true; // traversed the entire tree

        // see Image 1
        if(max_limit != null && root.val >= max_limit) return false;
        if(min_limit != null && root.val <= min_limit) return false;

        boolean left_subtree = isValid(root.left, min_limit, root.val);
        boolean right_subtree = isValid(root.right, root.val, max_limit);

        return left_subtree && right_subtree; // as both left and right trees should be true
    }
}

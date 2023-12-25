package com.BinaryTrees;

public class MaximumDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root)); // 3
    }

    public static int maxDepth(TreeNode root) {
        int res = 0;

        // base condition
        if(root == null) return res;

        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        res = Math.max(left_depth, right_depth);
        return res + 1; // as depth starts from 1
    }
}

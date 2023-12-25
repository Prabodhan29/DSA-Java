package com.BinaryTrees;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSame(p, q)); // true
    }

    public static boolean isSame(TreeNode p, TreeNode q) {
        // base condition
        if(p == null && q == null) return true; // both are null
        if(p == null || q == null) return false; // only one of them is null

        boolean value = p.val == q.val;
        boolean leftSubtree = isSame(p.left, q.left);
        boolean rightSubtree = isSame(p.right, q.right);

        return value && leftSubtree && rightSubtree;
    }
}

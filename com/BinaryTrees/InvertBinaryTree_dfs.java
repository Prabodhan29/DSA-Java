package com.BinaryTrees;

public class InvertBinaryTree_dfs {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        dfs(root);
    }

    public static void dfs(TreeNode root) {
        // base condition
        if(root == null) return;

        // swap left and right nodes
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // go to left and right subtrees
        dfs(root.left);
        dfs(root.right);
    }
}

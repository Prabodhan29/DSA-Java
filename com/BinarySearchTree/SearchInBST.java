package com.BinarySearchTree;

public class SearchInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(searchBST(root, 2).val); // 2
    }

    public static TreeNode searchBST(TreeNode root, int target) {
        // base condition
        if(root == null) return null;

        if(root.val == target) return root; // target found
        if(root.val < target) return searchBST(root.right, target);
        else return searchBST(root.left, target);
    }
}

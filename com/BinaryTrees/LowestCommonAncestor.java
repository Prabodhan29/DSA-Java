package com.BinaryTrees;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;

        System.out.println(lca(root, node1, node8).val); // 5
    }

    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        // base condition
        if(root == null) return null;
        if(root == p || root == q) return root;

        // traverse left and right subtree
        TreeNode left_subtree = lca(root.left, p, q);
        TreeNode right_subtree = lca(root.right, p, q);

        // both p and q exists and after traversing the entire tree,
        // there are no null values, then LCA should be root.
        if(left_subtree != null && right_subtree != null) return root;

        // if right subtree is does not contain p and q, then LCA will be
        // the node in left side that's equal to either p or q
        // that is, left_subtree
        if(right_subtree == null) return left_subtree;
        else return right_subtree;
    }
}

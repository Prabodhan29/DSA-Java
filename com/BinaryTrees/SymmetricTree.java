package com.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;
        System.out.println(isSymmetric2(leftSubTree, rightSubTree)); // true
    }

    public static boolean isSymmetric1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()) {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();

            // if both nodes are null, go skip the current iteration
            if(leftNode == null && rightNode == null) continue;

            if(leftNode == null || rightNode == null) return false; // if one of the nodes is null, return false

            if(leftNode.val != rightNode.val) return false; // compare the values

            // see Image 1
            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }

        return true;
    }

    public static boolean isSymmetric2(TreeNode leftSubtree, TreeNode rightSubtree) {
        // base condition
        if(leftSubtree == null && rightSubtree == null) return true;
        if(leftSubtree == null || rightSubtree == null) return false;

        // compare the values
        if(leftSubtree.val != rightSubtree.val) return false;

        boolean l = isSymmetric2(leftSubtree.left, rightSubtree.right);
        boolean r = isSymmetric2(leftSubtree.right, rightSubtree.left);

        return l && r;
    }
}

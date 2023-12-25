package com.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_bfs {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        bfs(root);
    }

    public static void bfs(TreeNode root) {
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            // swap currentNode left and right children
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;

            if(currentNode.left != null)
                queue.offer(currentNode.left);

            if(currentNode.right != null)
                queue.offer(currentNode.right);
        }
    }
}

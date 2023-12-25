package com.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenTreeToList {
    static Queue<TreeNode> queue = new LinkedList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        dfs(root);

        if(root == null || queue.size() < 1) return;

        root = queue.poll(); // the root node will not change
        root.left = null; // left child of every node is null

        TreeNode currentNode = root; // as we don't want to change the root node
        while(!queue.isEmpty()) {
            TreeNode nextNode = queue.poll();
            nextNode.left = null;
            currentNode.right = nextNode;
            currentNode = currentNode.right;
        }
    }

    public static void dfs(TreeNode root) {
        // base condition
        if(root == null) return;

        queue.offer(root);
        dfs(root.left);
        dfs(root.right);

        return;
    }

    // without using queue
    public static void m2(TreeNode root) {
        TreeNode currentNode = root;

        // see Image 1
        while(currentNode != null) {
            if(currentNode.left != null) {
                TreeNode temp = currentNode.left; // step 1
                while(temp.right != null) {
                    temp = temp.right;
                }
                temp.right = currentNode.right; // step 2
                currentNode.right = currentNode.left; // step 3
                currentNode.left = null;
            }

            // to increment currentNode
            currentNode = currentNode.right;
        }
    }
}

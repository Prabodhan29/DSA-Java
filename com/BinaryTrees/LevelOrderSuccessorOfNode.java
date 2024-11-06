package com.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(26);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(18);
        TreeNode node5 = new TreeNode(24);
        TreeNode node6 = new TreeNode(27);
        TreeNode node7 = new TreeNode(14);
        TreeNode node8 = new TreeNode(19);
        TreeNode node9 = new TreeNode(13);
        TreeNode node10 = new TreeNode(15);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        node7.left = node9;
        node7.right = node10;

        System.out.println(levelOrderSuccessor(root, 18).val);

    }

    public static TreeNode levelOrderSuccessor(TreeNode root, int input) {
        TreeNode res = new TreeNode();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if(currentNode.left != null) queue.offer(currentNode.left);
            if(currentNode.right != null) queue.offer(currentNode.right);

            if(currentNode.val == input) break;
        }

        res = queue.peek();
        return res;
    }
}

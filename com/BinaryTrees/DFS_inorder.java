package com.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS_inorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(dfs_recursion(root)); // [9, 3, 15, 20, 7]
        System.out.println(dfs_stack(root)); // [9, 3, 15, 20, 7]
    }

    public static List<Integer> dfs_recursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // base condition
        if(root == null) return res;

        res.addAll(dfs_recursion(root.left));
        res.add(root.val);
        res.addAll(dfs_recursion(root.right));

        return res;
    }

    public static List<Integer> dfs_stack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;
        // we can't do stack.isEmpty() because initially stack is empty
        while(true) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else {
                if(stack.isEmpty()) break; // terminate while loop condition
                currentNode = stack.pop(); // left
                res.add(currentNode.val); // add left in 1st iteration, then root in 2nd iteration
                currentNode = currentNode.right;
            }
        }

        return res;
    }
}

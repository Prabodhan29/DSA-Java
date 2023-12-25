package com.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS_preorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(dfs_recursion(root)); // [3, 9, 20, 15, 7]
        System.out.println(dfs_stack(root)); // [3, 9, 20, 15, 7]
    }

    public static List<Integer> dfs_recursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // base condition
        if(root == null) return res;

        res.add(root.val);
        res.addAll(dfs_recursion(root.left));
        res.addAll(dfs_recursion(root.right));

        return res;
    }

    public static List<Integer> dfs_stack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        TreeNode currentNode = root;
        while(!stack.isEmpty()) {
            currentNode = stack.pop();
            res.add(currentNode.val);

            // go to right subtree first (LIFO)
            if(currentNode.right != null) stack.push(currentNode.right);

            // then go to left subtree
            if(currentNode.left != null) stack.push(currentNode.left);
        }

        return res;
    }
}

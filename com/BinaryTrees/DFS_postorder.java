package com.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS_postorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(dfs_recursion(root)); // [9, 15, 7, 20, 3]
    }

    public static List<Integer> dfs_recursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // base condition
        if(root == null) return res;

        res.addAll(dfs_recursion(root.left)); // left subtree
        res.addAll(dfs_recursion(root.right)); // right subtree
        res.add(root.val); // root value

        return res;
    }
}

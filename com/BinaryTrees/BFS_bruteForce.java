package com.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_bruteForce {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(bfs(root)); // [[3], [9, 20], [15, 7]]
    }

    public static List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        // base condition
        if(root == null) return res;

        int height = treeHeight(root);
        for(int current_level = 1; current_level <= height; current_level++) {
            res.add(currentLevelNodes(root, current_level));
        }

        return res;
    }

    public static int treeHeight(TreeNode root){
        // base condition
        if(root == null) return 0;

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1; // add 1 as height starts from 1
    }

    public static List<Integer> currentLevelNodes(TreeNode root, int level){
        List<Integer> res = new ArrayList<>();

        // base condition
        if(root == null) return res;

        if(level == 1) {
            res.add(root.val);
            return res;
        }

        res.addAll(currentLevelNodes(root.left, level - 1));
        res.addAll(currentLevelNodes(root.right, level - 1));

        return res;
    }
}

package com.BinaryTrees;

public class SumRootToLeafNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        int sum = 0;
        System.out.println(sumNodes(root, sum)); // 1026
    }

    public static int sumNodes(TreeNode root, int sum) {
        // base condition
        if(root == null) return 0;

        sum = sum * 10 + root.val;

        // we traversed the entire tree, so return sum
        if(root.left == null && root.right == null) return sum;

        int leftTreeSum = sumNodes(root.left, sum);
        int rightTreeSum = sumNodes(root.right, sum);

        return leftTreeSum + rightTreeSum;
    }
}

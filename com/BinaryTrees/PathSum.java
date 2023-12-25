package com.BinaryTrees;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node3.left = node6;
        node3.right = node7;
        node2.left = node4;
        node2.right = node5;
        node5.right = node8;

        System.out.println(hasPathSum(root, 22)); // true
    }

    public static boolean hasPathSum(TreeNode root, int target) {
        // base condition
        if(root == null) return false;

        // after traversing the entire tree, there are two cases:
        // either you found target, or you didn't find target
        if(root.left == null && root.right == null) { // standing on last node
            if(target - root.val == 0) return true;
            else return false;
        }

        boolean leftSubtree = hasPathSum(root.left, target - root.val);
        boolean rightSubtree = hasPathSum(root.right, target - root.val);

        return leftSubtree || rightSubtree;
    }
}

package com.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int k = 1;
        List<Integer> al = inorder_traversal(root);
        System.out.println(al.get(k - 1)); // 1
    }

    public static List<Integer> inorder_traversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // base condition
        if(root == null) return res;

        res.addAll(inorder_traversal(root.left));
        res.add(root.val);
        res.addAll(inorder_traversal(root.right));

        return res;
    }
}

package com.BinarySearchTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println(targetExists1(root, 9)); // true

        HashSet<Integer> hs = new HashSet<>();
        System.out.println(targetExists2(root, 9, hs)); // true
    }

    public static boolean targetExists1(TreeNode root, int target) {
        List<Integer> al = inorder_traversal(root);
        int start = 0;
        int end = al.size() - 1;
        while(start < end) {
            if(al.get(start) + al.get(end) == target) return true;
            else if(al.get(start) + al.get(end) < target) start++;
            else end--;
        }
        return false;
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

    public static boolean targetExists2(TreeNode root, int target, HashSet<Integer> hs) {
        // base condition
        if(root == null) return false;

        // we can't create a HashSet here as for each recursion call a new HashSet is created.
        if(hs.contains(target - root.val)) return true; // answer found

        hs.add(root.val);
        boolean left_subtree = targetExists2(root.left, target, hs);
        boolean right_subtree = targetExists2(root.right, target, hs);

        return left_subtree || right_subtree;
    }
}

package com.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelAverageSum(root)); // [3.0, 14.5, 11.0]
    }

    public static List<Double> levelAverageSum(TreeNode root) {
        List<Double> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            double currentLevelSum = 0;

            for(int i=0; i<count; i++) {
                TreeNode currentNode = queue.poll();
                currentLevelSum = currentLevelSum + currentNode.val;

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            // as we want to find the average of the current level nodes
            res.add(currentLevelSum/count);
        }

        return res;
    }
}

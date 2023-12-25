package com.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_queue {
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

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // add root as the first element in the queue

        while(!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> currentLevelNodes = new ArrayList<>(count);

            // iterate through all the nodes in the current level
            for(int i=0; i<count; i++){
                TreeNode currentNode = queue.poll();
                currentLevelNodes.add(currentNode.val);

                // if the current node has children, add them to the queue
                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            res.add(currentLevelNodes);
        }

        return res;
    }
}

package com.BinaryTrees;

import java.util.*;

public class BFSReverse {
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
        queue.offer(root);

        while(!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> currentLevelNodes = new ArrayList<>(count);

            for(int i=0; i<count; i++){
                TreeNode currentNode = queue.poll();
                currentLevelNodes.add(currentNode.val);

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            res.add(0, currentLevelNodes);
        }
        Collections.reverse(res);
        return res;
    }
}

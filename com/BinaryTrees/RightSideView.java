package com.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(bfs(root)); // [1, 3, 4]
    }

    public static List<Integer> bfs(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int count = queue.size();
            for(int i=0; i<count; i++){
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);

                // only 1 element is present in the queue
                if(i == count - 1)
                    res.add(currentNode.val);
            }
        }

        return res;
    }
}

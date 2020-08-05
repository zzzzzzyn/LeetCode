package leetcode.q222_完全二叉树的节点个数;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int res = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res++;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return res;
    }

    public int countNodes2(TreeNode root) {
        return root != null ? 1 + countNodes(root.right) + countNodes(root.left) : 0;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


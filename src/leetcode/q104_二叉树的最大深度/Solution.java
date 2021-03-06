package leetcode.q104_二叉树的最大深度;

import java.util.*;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    public int dfs(TreeNode root) {
        int res = 0;
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res++;
        }
        return res;
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


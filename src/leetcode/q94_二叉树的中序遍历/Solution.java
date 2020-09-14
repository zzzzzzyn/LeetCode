package leetcode.q94_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        help(root, res);
        return res;
    }

    private void help(TreeNode root, List<Integer> list) {
        if (root == null) return;
        help(root.left, list);
        list.add(root.val);
        help(root.right, list);
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


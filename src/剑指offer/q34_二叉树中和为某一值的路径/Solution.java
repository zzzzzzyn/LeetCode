package 剑指offer.q34_二叉树中和为某一值的路径;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        findPath(root, sum);
        return res;
    }

    private void findPath(TreeNode root, int tar) {
        if (root == null) return;
        path.add(root.val);
        tar = tar - root.val;
        if (tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        findPath(root.left, tar);
        findPath(root.right, tar);
        path.removeLast();
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

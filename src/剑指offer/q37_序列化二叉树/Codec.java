package 剑指offer.q37_序列化二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // [1,2,3,null,null,4,5]
    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        if (root == null) return "[]";
//        StringBuilder res = new StringBuilder("[");
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        if (!queue.isEmpty()){
//
//        }
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//
//    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

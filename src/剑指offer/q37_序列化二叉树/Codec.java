package 剑指offer.q37_序列化二叉树;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    private Queue<TreeNode> queue = new LinkedList<>();
    private StringBuilder sb = new StringBuilder("[");

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }

        sb.append(",");
        sb.append(root.val);
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));

        return sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(","), "]").toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        new TreeNode(1);
        return null;


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

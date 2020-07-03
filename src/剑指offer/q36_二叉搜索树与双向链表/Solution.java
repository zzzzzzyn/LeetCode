package 剑指offer.q36_二叉搜索树与双向链表;

public class Solution {

    public Node treeToDoublyList(Node root) {

//        if ()
        return null;
    }

    private Node treeToDoubleListCore(Node root) {
        if (root.left == null && root.right == null) return root;

        if (root.left != null) {
            Node left = treeToDoublyList(root);
            root.left = root;
            left.right = root;
        }

        if (root.right != null) {
            Node right = treeToDoublyList(root);
            root.right = right;
            right.left = root;
        }

        return null;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}

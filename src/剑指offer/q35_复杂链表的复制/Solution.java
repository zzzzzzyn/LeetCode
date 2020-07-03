package 剑指offer.q35_复杂链表的复制;

public class Solution {

    Node first;

    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//
//        Node pNode = head;
//        while (pNode != null) {
//            Node cloneNode = new Node(pNode.val);
//            cloneNode.next = pNode.next;
//            cloneNode.random = null;
//
//        }
        return null;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

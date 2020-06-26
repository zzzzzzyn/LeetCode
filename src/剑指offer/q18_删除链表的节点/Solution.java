package 剑指offer.q18_删除链表的节点;

/**
 * Created by xyn on 2020/6/26
 */
public class Solution {

    public ListNode deleteNode(ListNode head, int val) {
        // 删除头结点(若只有一个节点返回null)
        if (head.val == val) return head.next;

        // 定位到删除节点的前一个节点位置
        ListNode curNode = head;
        while (curNode != null && curNode.next.val != val) {
            curNode = curNode.next;
        }

        // 删除节点是否尾结点
        if (curNode.next.next == null) {
            curNode.next = null;
        } else {
            curNode.next.val = curNode.next.next.val;
            curNode.next.next = curNode.next.next.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

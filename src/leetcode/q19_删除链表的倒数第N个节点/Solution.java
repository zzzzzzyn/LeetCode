package leetcode.q19_删除链表的倒数第N个节点;

/**
 * Created by xyn on 2020/7/27
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head;

        ListNode left = first;
        ListNode right = head;
        while (n - 1 > 0) {
            right = right.next;
            n--;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return first.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

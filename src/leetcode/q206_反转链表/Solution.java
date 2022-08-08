package leetcode.q206_反转链表;

import java.util.Stack;

/**
 * @author: xuyanan
 * @date: 2022/8/8
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()) return null;

        ListNode newHead = stack.pop();
        head = newHead;
        while (!stack.isEmpty()) {
            newHead.next = stack.pop();
            newHead = newHead.next;
        }

        newHead.next = null;
        return head;
    }

    public static class ListNode {
        int val;
        Solution.ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(){}
    }
}

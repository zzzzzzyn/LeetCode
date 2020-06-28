package 剑指offer.q24_反转链表;

/**
 * Created by xyn on 2020/6/28
 */
public class Solution {

    // 局部反转
    // 输入: 1->2->3->4->5->NULL
    // 输出: 5->4->3->2->1->NULL
    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode pre = head;

        while (pre != null) {
            ListNode tmp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = tmp;
        }

        return cur;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

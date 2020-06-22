package leetcode.q2_两数相加;

/**
 * Created by xyn on 2020/2/24
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 先计算出首位，因为最后需要返回res
        int flag = l1.val + l2.val >= 10 ? 1 : 0;
        ListNode res = flag == 1 ? new ListNode(l1.val + l2.val - 10) : new ListNode(l1.val + l2.val);
        ListNode preNode = res;
        while (true) {

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (l1 == null && l2 == null) {
                break;
            }

            int currentVal = 0;

            if (flag == 1) currentVal++;
            if (l1 != null) currentVal = currentVal + l1.val;
            if (l2 != null) currentVal = currentVal + l2.val;
            flag = currentVal >= 10 ? 1 : 0;
            if (flag == 1) currentVal = currentVal - 10;

            ListNode currentNode = new ListNode(currentVal);
            preNode.next = currentNode;
            preNode = currentNode;
        }

        if (flag == 1) {
            preNode.next = new ListNode(1);
        }

        return res;
    }

    /**
     * 官方解
     * 时间复杂度O(max(p.len, q.len))
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        // 一个标识节点
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


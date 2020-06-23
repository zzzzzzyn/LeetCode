package 剑指offer.q6_从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xyn on 2020/6/22
 */
public class Solution {

    // 先进后出，用栈
    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[]{};

        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        if (head == null) return new int[]{};

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] res = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            res[list.size() - 1 - i] = list.get(i);
        }
        return res;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

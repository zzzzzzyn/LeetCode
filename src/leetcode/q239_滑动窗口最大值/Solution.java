package leetcode.q239_滑动窗口最大值;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1 || k == 1) return nums;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) max = nums[j];
            }
            res.add(max);
        }

        int[] resarr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resarr[i] = res.get(i);
        }
        return resarr;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.offerLast(nums[i]);
        }
        res[0] = deque.peekFirst();

        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() == nums[i - k]) deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.offerLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }
}

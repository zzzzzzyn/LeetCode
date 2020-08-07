package leetcode.q239_滑动窗口最大值;

import java.util.ArrayList;
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
}

package leetcode.q454_四数相加II;

import java.util.HashMap;

public class Solution {


    // a+b = -(c+d)
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                int sum = n1 + n2;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int n1 : nums3) {
            for (int n2 : nums4) {
                int sum = n1 + n2;
                if (map.containsKey(-sum)) {
                    res = res + map.get(-sum);
                }
            }
        }

        return res;
    }
}
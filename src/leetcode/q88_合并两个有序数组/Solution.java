package leetcode.q88_合并两个有序数组;

import java.util.Arrays;

public class Solution {

    /**
     * 双指针
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }

        int pre = m + n - 1;
        m--;
        n--;
        while (n >= 0 && m >= 0) {

            if (nums1[m] >= nums2[n]) {
                nums1[pre] = nums1[m];
                m--;
                pre--;
            } else {
                nums1[pre] = nums2[n];
                n--;
                pre--;
            }

            if (m == -1) {
                for (int i = 0; i <= n; i++) {
                    nums1[i] = nums2[i];
                }
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

}


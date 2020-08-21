package leetcode.q287_第一个错误版本;

public class Solution {

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * The isBadVersion API is defined in the parent class VersionControl.
     */
    private boolean isBadVersion(int version) {
        return true;
    }
}
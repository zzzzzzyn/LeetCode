package leetcode.q11_盛最多水的容器;

/**
 * Created by xyn on 2020/4/18
 */
public class Solution {

    // 双指针法O(n)
    // 论证https://leetcode-cn.com/problems/container-with-most-water/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode-solution/
    //     https://leetcode-cn.com/problems/container-with-most-water/solution/container-with-most-water-shuang-zhi-zhen-fa-yi-do/
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}

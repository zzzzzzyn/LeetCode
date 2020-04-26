package q15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xyn on 2020/4/26
 */
public class Solution {

    // O(n2)
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return Collections.emptyList();
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // 首位数大于 0 说明后边相加无法等于0
            if (nums[i] > 0) return res;

            // 本位和后一位不能重复，例如本题排序后的两个 -1 ，一定会跳过第二个 -1
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int temp = nums[i] + nums[L] + nums[R];
                if (temp == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 判断 L 下一位是否和自己相等（找到后面第一个和自己不等的值）
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    // 判断 R 前一位是否和自己相等（找到前面第一个和自己不等的值）
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                } else if (temp < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return res;
    }
}

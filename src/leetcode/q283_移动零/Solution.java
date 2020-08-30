package leetcode.q283_移动零;

/**
 * Created by xyn on 2020/2/24
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        int l = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < l; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[l] = 0;
                l--;
            }
        }
    }

    /**
     * 两次遍历，第一次
     */
    public void moveZeroes2(int[] nums) {
        int j = 0;
        // j记录有多少个不为0的数
        // 第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // j开始到结束都是0
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes3(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }
    }

}
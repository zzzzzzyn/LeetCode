package 剑指offer.q38_字符串的排列;


import java.util.Arrays;

public class Solution {

//    public String[] permutation(String s) {
//        if (s.length() == 1) return new String[]{s};
//
//
//    }
//
//    private String Permutation(String s) {
//        if (s.length() == 1) return s;
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//
//        }
//    }

    // 绝对超时
    public int countDigitOne(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 1) res++;
                num = num / 10;
            }
        }
        return res;
    }

    public String minNumber(int[] nums) {
        Arrays.sort(nums);
        StringBuilder res = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            res.append(nums[i]);
        }
        return res.toString();
    }


}

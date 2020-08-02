package leetcode.q125_验证回文串;

/**
 * Created by xyn on 2020/8/2
 */
public class Solution {

    // 双指针
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        boolean res = true;
        while (left <= right) {
            while (left < s.length() && !validStr(s.charAt(left))) {
                left++;
            }
            while (right >= 0 && !validStr(s.charAt(right))) {
                right--;
            }
            if (left > right) {
                break;
            }
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }

    private boolean validStr(char str) {
        return str >= 'a' && str <= 'z' || str >= '0' && str <= '9' ||
                str >= 'A' && str <= 'Z';
    }

    // 筛选+比较
    public boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder reverse = new StringBuilder(sb).reverse();
        return reverse.toString().equals(sb.toString());
    }

}
package leetcode.q8_字符串转换整数;

/**
 * Created by xyn on 2020/4/16
 */
public class Solution {

    // O(n)
    public int myAtoi(String str) {
        // 去除左右空格
        str = str.trim();
        // 排除所有空格
        if(str.length() == 0)return 0;
        // 排除非法开头
        if(str.charAt(0) != '+' && str.charAt(0) != '-' && !(str.charAt(0) >= '0' && str.charAt(0) <= '9' ))return 0;

        int flag = 1;
        // 判断首字母
        if(str.charAt(0) == '+'){
            str = str.substring(1);
        }else if(str.charAt(0) == '-'){
            str = str.substring(1);
            flag = -1;
        }

        long res = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9')break;
            res = res * 10 + Integer.valueOf(String.valueOf(str.charAt(i)));
            if(res * flag > Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(res * flag < Integer.MIN_VALUE)return Integer.MIN_VALUE;
        }
        return (int)(res * flag);
    }
}

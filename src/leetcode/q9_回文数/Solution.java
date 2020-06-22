package leetcode.q9_回文数;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyn on 2020/4/16
 */
public class Solution {

    // O(n)
    public boolean isPalindrome(int x) {
        // 首先干掉负数
        if (x < 0) return false;

        // 将x分解放入list
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x = x / 10;
        }

        // 判断是否回文
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) return false;
        }
        return true;
    }

    // O(n)
    public boolean isPalindrome2(int x) {
        // 负数或不为0的10的倍数都为false
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reverseNum = 0;
        // 反转一半的数，例如（12345）只反转到3
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        // 判断是否回文
        return reverseNum == x || reverseNum / 10 == x;
    }
}

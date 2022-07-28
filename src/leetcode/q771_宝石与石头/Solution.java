package leetcode.q771_宝石与石头;

import java.util.HashSet;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int num = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c))num++;
        }

        return num;
    }

}
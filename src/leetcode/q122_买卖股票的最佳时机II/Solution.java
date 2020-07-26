package leetcode.q122_买卖股票的最佳时机II;

public class Solution {

    // 上升阶段的总和
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}

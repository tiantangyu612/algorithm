package algorithm.leetcode.array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class Q122_MaxProfit {
    public int maxProfit(int[] prices) {
        if (null == prices || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Q122_MaxProfit maxProfit = new Q122_MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

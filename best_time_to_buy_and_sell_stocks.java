class Solution {
    public int maxProfit(int[] prices) {
        int min_profit = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int price : prices) {
            if (price < min_profit) {
                min_profit = price;
            } else if (price - min_profit > max_profit) {
                max_profit = price - min_profit;
            }
        }

        return max_profit;
    }
}

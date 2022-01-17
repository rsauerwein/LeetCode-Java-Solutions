public class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int highest = prices[0];
        int maxTrade = 0;

        for (int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];
            if (currPrice < lowest) {
                lowest = currPrice;
                highest = 0;
            } else if (currPrice > highest) {
                highest = currPrice;
            }
            maxTrade = highest - lowest > maxTrade ? highest - lowest : maxTrade;
        }

        return maxTrade > 0 ? maxTrade : 0;
    }
}
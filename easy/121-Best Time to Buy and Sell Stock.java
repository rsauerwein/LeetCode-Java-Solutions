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
            int currTrade = highest - lowest;
            if(currTrade > maxTrade) maxTrade = currTrade;
        }

        return maxTrade;
    }
}
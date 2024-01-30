public class Solution
{
    public int maxProfit(int[] prices)
    {
        int minPrice = prices[0], maxProfit = 0, profit;
        for(int i = 1; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
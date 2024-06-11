/*
    Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    Problem Name & Number: 121. Best Time to Buy and Sell Stock
    Problem Description: You are given an array prices where prices[i] is the price of a given stock on the ith day.
                        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
                        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class Best_Time_To_Buy_And_Sell_Stocks {
    // TC -> O(N)
    // SC -> O(1)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
            buy = Math.min(buy, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        // Test Cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}

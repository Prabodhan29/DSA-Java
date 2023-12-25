package com.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // 5
        System.out.println(maxProfit1(prices)); // 5
    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int max_profit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++) {
            buy = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                sell = prices[j];
                max_profit = Math.max(max_profit, sell-buy);
            }
        }

        // no profit achieved
        if(max_profit < 0) return 0;

        return max_profit;
    }

    public static int maxProfit1(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min_price) {
                min_price = prices[i];
            }

            // we are indirectly doing sell - buy
            profit = prices[i] - min_price;
            if (profit > max_profit) {
                max_profit = profit;
            }
        }

        return max_profit;
    }
}

package com.jKm;

public class D1Q6B_StockBuySell {
    public int maxProfit(int[] prices) {
        int maxPro = 0;int diff=0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            diff=prices[i] - minPrice;
            maxPro = Math.max(maxPro, diff);
        }
        return maxPro;
    }


    public static void main(String[] args) {

        int[] prices1={7,1,5,3,6,4};
        int[] prices2={7,6,4,3,1};
        int[] prices3={1,2,3,4,5,6,7};
        D1Q6B_StockBuySell sell=new D1Q6B_StockBuySell();
        System.out.println(sell.maxProfit(prices1));
        System.out.println(sell.maxProfit(prices2));
        System.out.println(sell.maxProfit(prices3));

    }
}

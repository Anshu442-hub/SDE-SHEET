package com.jKm;

public class D1Q6A_StockBuySell {
    public int maxProfit(int[] prices) { //TLE
        int n= prices.length;
        int diff=0; int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    diff=prices[j]-prices[i];
                    max = (Math.max(diff, max));
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] prices1={7,1,5,3,6,4};
        int[] prices2={7,6,4,3,1};
        int[] prices3={1,2,3,4,5,6,7};
        D1Q6A_StockBuySell sell=new D1Q6A_StockBuySell();
        System.out.println(sell.maxProfit(prices1));
        System.out.println(sell.maxProfit(prices2));
        System.out.println(sell.maxProfit(prices3));

    }

}

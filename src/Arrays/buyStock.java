/*https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different
day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
package Arrays;

public class buyStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int max=0;
        int cur=prices[0];
        for (int price : prices) {
            if (cur > price) {
                cur = price;
            } else {
                int profit= price-cur;
                if(profit>max){
                    max = price - cur;
                }
            }
        }
        return max;
    }
}

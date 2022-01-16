package Arrays;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
import java.util.Arrays;

public class stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int cur=prices[0];
        int profit=0;
        for (int i=0; i<prices.length; i++){
            if(prices[i]<cur){    //finding the minimum price to buy the stock
                cur=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-cur); //checks if the current is profit is greater than the next profit
            }
        }
        return profit;
    }
}

package Dsa_sheet;

public class Buy_sell_stocks {
    public static int Buy_Sell_Stocks(int prices[]){
        int n= prices.length;
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit =0;

        //loop
        for(int i=0;i<n;i++){
         if(buyPrice < prices[i]){ //profit
            int profit = prices[i]- buyPrice; //today's profit
            maxProfit = Math.max(maxProfit,profit);
         }else{
            buyPrice = prices[i];
         }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        //Buy & Sell Stock
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buy_Sell_Stocks(prices));
    }
}

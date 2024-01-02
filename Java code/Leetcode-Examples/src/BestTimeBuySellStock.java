
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max_profit = 0;
        while (sell < prices.length){
            if (prices[buy] < prices[sell]){
                if (max_profit < prices[sell] - prices[buy]){
                    max_profit = prices[sell] - prices[buy];
                }
            }
            else{
                buy = sell;
            }
            sell++;
        }
        return max_profit;
    }
}
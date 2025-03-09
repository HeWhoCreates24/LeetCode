public class BuySellStocks{
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int last_min = 0;
        for (int i = 0; i < prices.length; i++){
            int profit = prices[i]-prices[last_min];
            max_profit = Math.max(profit, max_profit);
            if (prices[i] < prices[last_min]) last_min = i;
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit -> " + maxProfit(prices)); // 5
    }
}
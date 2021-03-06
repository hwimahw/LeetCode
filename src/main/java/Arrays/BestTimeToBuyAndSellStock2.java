package Arrays;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                sum += (prices[i + 1] - prices[i]);
            }
        }
        return sum;
    }
}

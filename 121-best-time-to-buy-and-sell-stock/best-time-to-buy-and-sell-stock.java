class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] > minBuy){
                profit = prices[i] - minBuy;

                maxProfit = Math.max(profit , maxProfit);

            }
            minBuy = Math.min(prices[i] , minBuy);
        }
        return maxProfit;
    }
}
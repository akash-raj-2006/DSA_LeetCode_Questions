class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=prices[0];
    for(int i=1;i<prices.length;i++){
       if(prices[i] < minProfit){
        minProfit = prices[i];
       } else {
       int profit = prices[i] - minProfit;
        if(maxProfit < profit){
            maxProfit = profit;
        }
       }
    }
    return maxProfit;
    }
}
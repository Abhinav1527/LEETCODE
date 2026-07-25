class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxprofit = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i] - min;
            maxprofit = Math.max(maxprofit,cost);
            if(min>prices[i]){
                min = prices[i];
            }
        }
        return maxprofit;
    }
}
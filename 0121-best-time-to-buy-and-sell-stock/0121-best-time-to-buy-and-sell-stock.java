class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int max = 0;
        for(int i = 1; i < n; i++){
            mini = Math.min(mini, prices[i]);
            int profit = prices[i] - mini;
            max = Math.max(max, profit);
        }
        return max;
    }
}
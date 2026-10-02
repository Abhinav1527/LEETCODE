class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        int n = coins.length;

        dp = new int[n+1][amount+1];
        for(int[] row : dp) {
            Arrays.fill(row,-1);
        }
        return solve(coins,n,0,amount);
    }
    public int solve(int[] nums,int n,int idx,int amount) {
        if(amount == 0) {
            return 1;
        }
        if(idx == n) {
            return 0;
        }
        if(dp[idx][amount] != -1) {
            return dp[idx][amount];
        }
        int ways = 0;
        if(nums[idx] <= amount) {
            ways += solve(nums,n,idx,amount - nums[idx]);
        }
        ways += solve(nums,n,idx+1,amount);

        return dp[idx][amount] = ways;
    }
}
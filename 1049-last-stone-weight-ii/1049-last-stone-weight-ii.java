class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for(int x : stones) {
            sum += x;
        }
        int t = sum/2;

        boolean[][] dp = new boolean[n+1][t+1];
        for(int i=0;i<n+1;i++) {
            dp[i][0] = true;
        }

        for(int j=1;j<t+1;j++) {
            dp[0][j] = false;
        }

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<t+1;j++) {
                if(stones[i-1] <= j) {
                    dp[i][j] = dp[i-1][j-stones[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int diff = 0;
        for(int i=t;i>=0;i--) {
            if(dp[n][i]) {
                diff = i;
                break;
            }
        }
        return sum - 2*diff;
    }
}
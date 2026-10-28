class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][][] dp = new boolean[n][m][1024];
        dp[0][0][grid[0][0]] = true;
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    {
                        for(int xor=0;xor<1024;xor++)
                            {
                                if(!dp[i][j][xor]) continue;

                                if(i+1<n)
                                {
                                    dp[i+1][j][xor^grid[i+1][j]] = true;;
                                }
                                if(j+1<m)
                                {
                                    dp[i][j+1][xor^grid[i][j+1]] = true;
                                }
                            }
                    }
            }
        for(int x=0;x<1024;x++)
            {
                if(dp[n-1][m-1][x])
                {
                    return x;
                }     
            }
        return -1;
    }
}
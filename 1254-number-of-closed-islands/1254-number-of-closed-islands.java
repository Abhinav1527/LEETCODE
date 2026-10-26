class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 0 && close(i,j,n,m,grid)) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean close(int i,int j,int n,int m,int[][] grid) {
        if(i<0 || i>=n || j<0 || j>=m) {
            return false;
        }
        if(grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1;
        return close(i+1,j,n,m,grid) & close(i-1,j,n,m,grid) & close(i,j+1,n,m,grid) & close(i,j-1,n,m,grid);
    }
}
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            boolean[] vis = new boolean[101];
            for(int j=0;j<n;j++) {
                if(vis[matrix[i][j]]){
                    return false;
                }
                vis[matrix[i][j]] = true;
            }
        }

        for(int j=0;j<n;j++) {
            boolean[] vis = new boolean[101];
            for(int i=0;i<n;i++) {
                if(vis[matrix[i][j]]) {
                    return false;
                }
                vis[matrix[i][j]] = true;
            }
        }
        return true;
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += mat[i][i];
        }
        int row = 0;
        int col = n-1;
        for(int i=0;i<n;i++) {
            sum += mat[row++][col--];
        }

        if(n%2!=0) {
            int idx = (n-1)/2;
            sum = sum - mat[idx][idx];
        }
        return sum;
    }
}
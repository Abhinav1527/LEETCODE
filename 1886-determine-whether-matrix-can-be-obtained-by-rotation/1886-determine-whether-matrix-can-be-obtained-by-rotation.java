class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int k = 0; k < 4; k++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat, n);
        }
        return false;
    }

    public void rotate(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int t = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = t;
                l++;
                r--;
            }
        }
    }
}
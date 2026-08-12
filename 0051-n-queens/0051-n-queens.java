class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] higherDiagonal = new int[2*n-1];
        solve(0,n,board,leftRow,lowerDiagonal,higherDiagonal,ans);
        return ans;
    }
    public void solve(int col,int n,char[][] board,int[] leftRow,int[] lowerDiagonal,int[] higherDiagonal,List<List<String>> ans){
        if(col == n){
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int row=0;row<n;row++){
            if(leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && higherDiagonal[n-1+col-row] == 0){
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                higherDiagonal[n-1+col-row] = 1;
                board[row][col] = 'Q';

                solve(col+1,n,board,leftRow,lowerDiagonal,higherDiagonal,ans);
                
                 board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                higherDiagonal[n-1+col-row] = 0;
            }
        }
    }
}
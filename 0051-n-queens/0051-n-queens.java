class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        solve(0,n,board,ans);
        return ans;
    }
    public void solve(int col,int n,char[][] board,List<List<String>> ans){
        if(col == n){
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int row=0;row<n;row++){
            if(isValid(row,col,board,n)){
                board[row][col] = 'Q';
                solve(col+1,n,board,ans);
                board[row][col] = '.';
            }
        }
    }
    public boolean isValid(int row,int col,char[][] board,int n){
        //checking left row
        for(int j=0;j<col;j++){
            if(board[row][j] == 'Q') return false;
        }

        //checking higherLeft
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }

        //checking lowerLeft
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
}
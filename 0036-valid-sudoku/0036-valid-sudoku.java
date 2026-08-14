class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.'){
                    if(!isValid(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i] == c){
                return false;
            }
            if(i!= row && board[i][col] == c){
                return false;
            }
            int rw = 3*(row/3)+i/3;
            int cl = 3*(col/3)+i%3;
            if((rw!=row && cl!=col) && board[rw][cl] == c){
                return false;
            }
        }
        return true;
    }
}
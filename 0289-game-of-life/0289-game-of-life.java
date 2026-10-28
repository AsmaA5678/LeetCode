class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length==0 || board[0].length==0){
            return;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int current= board[i][j];
                int count=countNeighbors(board,i,j);
                if(current==1 && count<2){
                    board[i][j]=-1;
                }else if(current==1 && count>3){
                    board[i][j]=-1;
                }else if(current==0 && count==3){
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=board[i][j]>0?1:0;
            }
        }
    }
    public int countNeighbors(int[][] board,int row,int col){
        int count=0;
        for(int i=row-1;i<=row+1;i++){
            for(int j=col-1;j<=col+1;j++){
                if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1){
                    continue;
                }
                if(i==row && j==col){
                    continue;
                }
                if(board[i][j]==-1 || board[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
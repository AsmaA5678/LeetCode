class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int row=i;
            while(row<matrix.length-1 && j<matrix[0].length-1){
                if(matrix[row][j]!=matrix[row+1][j+1]){
                    return false;
                }
                row++;
                j++;
            }
        }
        for(int j=1;j<matrix[0].length;j++){
            int i=0;
            int col=j;
            while(i<matrix.length-1 && col<matrix[0].length-1){
                if(matrix[i][col]!=matrix[i+1][col+1]){
                    return false;
                }
                i++;
                col++;
            }
        }
        return true;
    }
}
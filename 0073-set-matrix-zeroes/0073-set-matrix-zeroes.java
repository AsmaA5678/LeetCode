class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowNull=false;
        boolean colNull=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) rowNull=true;
                    if(j==0) colNull=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(rowNull==true){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(colNull==true){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}
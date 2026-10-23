class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int x=1;
        int[][] result=new int[n][n];
        while(x<=n*n && top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result[top][i]=x;
                x++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[i][right]=x;
                x++;
            }
            right--;
                for(int i=right;i>=left;i--){
                    result[bottom][i]=x;
                    x++;
                }
                bottom--;
         
           
                for(int i=bottom;i>=top;i--){
                    result[i][left]=x;
                    x++;
                }
                left++;
            
        }
        return result;
    }
}
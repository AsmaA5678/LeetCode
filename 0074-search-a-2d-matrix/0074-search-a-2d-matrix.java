class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0 || matrix==null) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start=0;
        int end = rows*cols-1;
        while(start<=end){
            int mid=start + (end -start)/2;
            if(matrix[mid/cols][mid%rows]==target){
                return true;
            }else if(matrix[mid/cols][mid%rows]<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
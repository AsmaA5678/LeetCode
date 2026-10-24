class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] result=new int[mat[0].length*mat.length];
        int l=0;
        int diagonal=0;

        for(int k=0;k<mat.length;k++){
            int i=k;
            int j=0;
            int start=l;
            while(i>=0 && j<mat[0].length){
                result[l]=mat[i][j];
                l++;
                i--;
                j++;
            }
            if(diagonal%2==1){
                reverse(result,start,l-1);
            }
            diagonal++;
        }
        for(int k=1;k<mat[0].length;k++){
            int i=mat.length-1;
            int j=k;
            int start=l;
            while(i>=0 && j<mat[0].length){
                result[l]=mat[i][j];
                l++;
                i--;
                j++;
            }
            if(diagonal%2==1){
                reverse(result,start,l-1);
            }
            diagonal++;
        }
        return result;
    }
    private void reverse(int[] result, int left, int right) {
    while (left < right) {
        int temp = result[left];
        result[left] = result[right];
        result[right] = temp;

        left++;
        right--;
    }
}
}
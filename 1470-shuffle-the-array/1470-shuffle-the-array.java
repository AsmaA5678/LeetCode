class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        int i=0;
        int j=0;
        while(i<2*n){
            result[i]=nums[j];
            result[i+1]=nums[j+n];
            i+=2;
            j++;
        }
        return result;
    }
}
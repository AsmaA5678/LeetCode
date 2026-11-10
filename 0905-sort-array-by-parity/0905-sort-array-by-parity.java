class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        int[] res=new int [nums.length];
        while(k<nums.length){
            if(nums[k]%2==0){
                res[i]=nums[k];
                i++;
                k++;
            }else{
                res[j]=nums[k];
                k++;
                j--;
            }
        }
        return res;
    }
}
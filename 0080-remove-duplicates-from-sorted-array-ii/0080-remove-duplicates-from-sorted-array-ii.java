class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int j=1;
       int res=1;
       int k = 1;
       while( j<nums.length){
            if(nums[i]==nums[j]){
                if(k<2){
                    nums[res]=nums[j];
                    k++;
                    res++;
                }
                j++;
            }else{
                nums[res]=nums[j];
                i=j;
                j++;
                res++;
                k=1;
            }
       }
       return res;
    }
}
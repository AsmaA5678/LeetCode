class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int i=0;
        int k=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                    j++;
            }else{
                nums[k]=nums[j];
                k++;
                i=j;
                j++;
            }
        }
        return k;
    }
}


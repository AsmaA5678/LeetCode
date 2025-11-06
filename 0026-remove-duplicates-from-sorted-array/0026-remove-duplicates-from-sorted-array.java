class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int i=0;
        int current=nums[0];
        while(i<nums.length){
            if(nums[i]!=current){
                current=nums[i];
                nums[k]=current;
                k++;
            }
            i++;
        }
        return k;
    }
}


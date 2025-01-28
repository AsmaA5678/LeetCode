class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num){
                continue;
            }else{
                nums[k]=nums[i];
                k++;
                num=nums[i];
            }
        }
        return k;
    }
      
}
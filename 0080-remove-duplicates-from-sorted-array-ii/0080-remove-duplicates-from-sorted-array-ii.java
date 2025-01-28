class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num && count==2){
                continue;
            }else if(nums[i]==num && count<=1){
                nums[k]=nums[i];
                count++;
                k++;
            }else if(nums[i]!=num){
                count=1;
                num=nums[i];
                nums[k]=nums[i];
                k++;
            }   
        }
        return k;
    }
}
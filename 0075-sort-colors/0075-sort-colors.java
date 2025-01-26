class Solution {
    public void sortColors(int[] nums) {
        int temp=0;
        for(int i=0; i<nums.length-1;i++){
            int min=i;
            for(int j=i;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        
    }
}
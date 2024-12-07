class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max= max(nums);
        int d=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]-max < d) && (nums[i]-max!=0)){
                result=nums[i];
            }
        }
        return result;
    }
    public int max(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
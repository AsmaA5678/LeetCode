class Solution {
    public int search(int[] nums, int target) {
           return search(nums,target,0,nums.length-1);
    }
    public int search(int[] nums, int target, int start,int end) {
        if(start>end) return -1;
        int midlle=start+(end-start)/2;
        if(nums[midlle]==target){
            return midlle;
        }else if(nums[midlle]>target){
            return search(nums,target,start,midlle-1);
        }else if(nums[midlle]<target){
            return search(nums,target,midlle+1,end);
        }
        return -1;
    }
}
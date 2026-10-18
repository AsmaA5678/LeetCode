class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int left=0;
        int right=0;
        int max=0;
        while(right<nums.length){
            if(nums[right]==0) count++;
            while(count>k){
                if(nums[left]==0){
                   count--;
                }
                left++;
            }
            right++;
            max=Math.max(max,right-left);
        }
        return max;
    }
}
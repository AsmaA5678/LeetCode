class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count1=countSubArrays(nums,k);
        int count2=countSubArrays(nums,k-1);
        return count1-count2;
    }
    public int countSubArrays(int[] nums,int goal){
        if (goal<0) return 0;
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        while(right<nums.length){
            sum+=nums[right]%2;
            while(sum>goal){
                sum-=nums[left]%2;
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }

}
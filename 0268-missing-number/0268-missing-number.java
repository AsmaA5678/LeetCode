class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=nums[i];
        }
        return sum-currentSum;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int some=0;
        for(int i=0;i<k;i++){
            some+=nums[i];
        }
        double max=some;
        int left=1;
        int right=k;
        while(right<nums.length){
            some=some-nums[left-1]+nums[right];
            max=Math.max(max,some);
            left++;
            right++;
        }
        return max/k;
        
    }
}
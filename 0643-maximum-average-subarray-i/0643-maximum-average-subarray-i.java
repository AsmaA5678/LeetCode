class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int left=0;
        int right=k;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int current=max;
        while(right<nums.length){
            current=current-nums[left]+nums[right];
            left++;
            right++;
            max=Math.max(max,current);
        }
        return (double)max/k;
    }
}
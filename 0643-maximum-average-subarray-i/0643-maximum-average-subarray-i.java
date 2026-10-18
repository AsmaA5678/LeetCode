class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            if(i>=k){
                current-=nums[i-k];
            }
            if(i>=k-1){
                max=Math.max(max,current);
            }
        }
        return (double) max/k;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int sum=0;
        while(i<nums.length){
            sum+=nums[i];
            if(i>=k){
                sum-=nums[i-k];
            }
            if(i>=(k-1)){
                max=Math.max(sum,max);
            }
            i++;
        }
        return (double)max/k;
    }
}
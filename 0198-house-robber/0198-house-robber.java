class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int s=0;
        for(int i=0; i<nums.length;i++){
            s=Math.max(nums[i]+a,b);
            a=b;
            b=s;
        }
        return s;
    }
}
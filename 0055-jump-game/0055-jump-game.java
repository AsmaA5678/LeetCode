class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1 ) return true;
        int reach=0;
        for(int i=0;i<nums.length;i++){
            reach=Math.max(reach,i+nums[i]);
            if(reach==nums.length-1){
                return true;
            }
        }
        return false;
    }
}
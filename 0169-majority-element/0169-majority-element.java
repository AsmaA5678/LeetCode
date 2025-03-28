class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==x){
                cnt++;
            }else if(nums[i]!=x){
                cnt--;
            }
            if(cnt<0){
                x=nums[i];
                cnt=1;
            }
        }
        return x;
    }
}

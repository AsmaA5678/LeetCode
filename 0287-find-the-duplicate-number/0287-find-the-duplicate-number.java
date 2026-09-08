class Solution {
    public int findDuplicate(int[] nums) {
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(count[i]>1){
                return i;
            }
        }
        return 0;
    }
}
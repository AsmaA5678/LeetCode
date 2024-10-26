class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        Arrays.fill(nums, k, nums.length, 0);
        return k;
    }    
}

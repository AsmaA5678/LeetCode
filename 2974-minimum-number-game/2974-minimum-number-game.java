class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int right=0;
        int left=1;
        while(left<n){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right+=2;
            left+=2;
        }         
        return nums;          
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
            int k=nums.length-1;
            while(k>0 && nums[k]==val){
                k--;
            }
            int j = k;
            int i = k;
            while(i>=0){
                if(nums[i]==val){
                    nums[i]=nums[j];
                    j--;
                }
                i--;
            }
            return j+1;
    }    
}

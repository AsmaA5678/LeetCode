class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        int i=0;
        int start=0;
        while(i<nums.length){
            if(nums[i]==0){
                count++;
            }
            if(count<=k){
                max=Math.max(max,i-start+1);
            }
            while(count>k){
                if(nums[start]==0){
                    count--;
                }
                start++;
            }
            i++;
        }
        return (max==Integer.MIN_VALUE)? 0: max;
    }
}
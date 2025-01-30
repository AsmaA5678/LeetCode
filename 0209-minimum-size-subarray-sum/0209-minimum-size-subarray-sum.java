class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int k=0;
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
           while(count>=target){
                    minLength = Math.min(minLength, i - k +1);
                    count-=nums[k];
                    k++;
            }
            
        }
        if (minLength == Integer.MAX_VALUE) {
              return 0;
        } else {
              return minLength;
        }

    }
}
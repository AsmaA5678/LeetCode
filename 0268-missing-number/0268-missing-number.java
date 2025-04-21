class Solution {
    public int missingNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
             if(nums[i]>max){
                max=nums[i];
            }
        }
        int expectedSum=0;
        if(max==nums.length){
            expectedSum=(max-min+1)*(max+min)/2;
        }else{
            expectedSum=(max-min+2)*(max+1+min)/2;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return expectedSum-sum;
    }
}
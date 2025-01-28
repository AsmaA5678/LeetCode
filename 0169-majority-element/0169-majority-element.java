import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
       int count=0;
       int majority=nums[0];
       for(int i=1; i<nums.length;i++){
            if(nums[i]!=majority && count!=0){
                count--;
            }else if(nums[i]!=majority && count==0){
                majority=nums[i];
            }else{
                count++;
            }
       }
       return majority;
    }
}

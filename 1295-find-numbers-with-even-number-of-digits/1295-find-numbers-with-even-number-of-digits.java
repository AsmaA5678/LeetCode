class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int digits=0;
            int current=nums[i];
            while(current!=0){
                digits++;
                current/=10;
            }
            if(digits%2==0) res++;

        }
        return res;
    }
}
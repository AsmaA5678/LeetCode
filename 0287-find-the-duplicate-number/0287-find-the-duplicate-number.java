class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] listCount=new int[n];

        for(int i=0;i<n;i++){
            if(listCount[nums[i]]>=1){
                return nums[i];
            }else{
                listCount[nums[i]]+=1;
            }
        }
        return -1;
    }
}
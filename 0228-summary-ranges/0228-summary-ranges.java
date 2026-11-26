class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0) return result;
        int i=0;
        int start=nums[i];
        while(i<nums.length){
            int end=start;
            int j=i+1;
            while(j<nums.length && nums[j]==nums[j-1]+1){
                end=nums[j];
                j++;
            }
            if(start==end){
                result.add(""+start);
            }else{
                result.add(start+"->"+end);
            }
            if(j<nums.length) start=nums[j];
            i=j;
        }
        return result;
        
    }
}
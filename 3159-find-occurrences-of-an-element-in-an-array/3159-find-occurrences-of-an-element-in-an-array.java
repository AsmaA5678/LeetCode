class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> track=new ArrayList<>();
        int[] result=new int[queries.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                track.add(i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i]> track.size()){
                result[i]=-1;
            }else{
                result[i]=track.get(queries[i]-1);
            }
        }
        return result;
    }
}
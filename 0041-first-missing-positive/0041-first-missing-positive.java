class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!seen.contains(i)){
                return i;
            }
        }
        return nums.length;
        
    }
}
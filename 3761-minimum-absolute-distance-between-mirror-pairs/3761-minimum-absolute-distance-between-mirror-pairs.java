class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int reverse=0;
            while(current!=0){
                reverse=reverse*10 + current%10;
                current/=10;
            }
            if(map.containsKey(nums[i])){
                result=Math.min(result,Math.abs(i-map.get(nums[i])));
            }
            map.put(reverse,i);
        }
        if( result==Integer.MAX_VALUE) return -1;
        return result;
        
    }
}
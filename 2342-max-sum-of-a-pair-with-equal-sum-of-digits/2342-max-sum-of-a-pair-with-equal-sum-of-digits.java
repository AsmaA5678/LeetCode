class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int sum=0;
            while(current!=0){
                sum+=current%10;
                current/=10;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,nums[i]+map.get(sum));
            }
            map.put(sum,Math.max(nums[i],map.getOrDefault(sum,0)));
            
        }
        return max;
        
    }
}
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum%k) && (i-map.get(sum%k))>=2){
                return true;
            }else if(!map.containsKey(sum%k)){
                map.put(sum%k,i);
            }
        }
        return false;
    }
    //sum(0,j)=sum(0,i)+sum(i,j)
    //sum(0,j)-sum(0,i)=sum(i,j)=k*n
    //sum(0,j)%k-sum(0,i)%k==0
}
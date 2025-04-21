class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(freq[i]==2){
                res.add(i);
            }
        }
        return res;
    }
}
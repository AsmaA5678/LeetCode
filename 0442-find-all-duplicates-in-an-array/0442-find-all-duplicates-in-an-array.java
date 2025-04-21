class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res=new ArrayList<>();
        int currentNumber=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(currentNumber==nums[i]){
                freq++;
            }else{
                if(freq==2){
                    res.add(currentNumber);
                }
                currentNumber=nums[i];
                freq=1;
            }
            if(i==nums.length-1 && freq==2) res.add(currentNumber);
        }
        return res;
    }
}
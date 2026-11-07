class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        while(left<right){
            int midlle=left+1;
            while(midlle<right){
                if(nums[left]+nums[right]+nums[midlle]==0){
                    result.add(Arrays.asList(nums[left],nums[right],nums[midlle]));
                    if( midlle + 1 < right){
                        midlle++;
                        while(midlle < right && nums[midlle]==nums[midlle-1]) midlle++;
                    }else{
                        break;
                    }
                }else if(nums[left]+nums[right]+nums[midlle]<0 && midlle + 1 < right){
                    midlle++;
                }else{
                    right--;
                }
            }
            left++;
            while (left < right && nums[left] == nums[left - 1]) {
                left++;
            }
            right = nums.length - 1;
            
            
        }
        return result;
    }
}
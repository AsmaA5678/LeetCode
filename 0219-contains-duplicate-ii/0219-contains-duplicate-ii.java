class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (check.containsKey(x) && i - check.get(x) <= k) {
                return true;
            }
            check.put(x, i);
        }
        return false;        
    }
}
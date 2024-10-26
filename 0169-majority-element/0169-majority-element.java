import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }
        return findKeyWithMaxValue(countMap);
    }

    public static int findKeyWithMaxValue(HashMap<Integer, Integer> map) {
        int maxKey = -1; 
        int maxValue = Integer.MIN_VALUE;

        for (int key : map.keySet()) {
            if (map.get(key) > maxValue) { 
                maxValue = map.get(key);
                maxKey = key; 
            }
        }
        return maxKey; 
    }
}

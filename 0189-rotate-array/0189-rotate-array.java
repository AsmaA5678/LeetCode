class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotat = new int[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            rotat[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotat[i];
        }        
    }
}
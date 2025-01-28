class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int[] help = nums.clone(); 
        
        for (int i = 0; i < n; i++) {
            nums[i] = help[(n-k+i)%n]; 
        }
    }
}


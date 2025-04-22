class Solution {
    public int findPeakElement(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int start, int end) {
        if (start == end) return start;

        int mid = start + (end - start) / 2;
        if (nums[mid] > nums[mid + 1]) {
            
            return binarySearch(nums, start, mid);
        } else {
            return binarySearch(nums, mid + 1, end);
        }
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        int[] result = {left, right};
        while (left < right) {
            if (numbers[left] + numbers[right] < target) left++;
            else if (numbers[left] + numbers[right] > target) right--;
            else if (numbers[left] + numbers[right] == target) {
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }
        return new int[] {-1,-1};
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int maxLength = 0;

        for (int num : numbers) {
            if (!numbers.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numbers.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}


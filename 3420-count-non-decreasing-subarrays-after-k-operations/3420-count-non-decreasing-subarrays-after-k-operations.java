class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        // Each group stores {target value, number of elements}.
        Deque<int[]> groups = new ArrayDeque<>();

        int right = nums.length - 1;
        long cost = 0;
        long answer = 0;

        for (int left = nums.length - 1; left >= 0; left--) {
            int value = nums[left];
            int size = 1;

            while (!groups.isEmpty() && groups.peekFirst()[0] <= value) {
                int[] group = groups.removeFirst();
                cost += (long) (value - group[0]) * group[1];
                size += group[1];
            }

            groups.addFirst(new int[]{value, size});

            while (cost > k) {
                int[] lastGroup = groups.peekLast();
                cost -= lastGroup[0] - nums[right];
                right--;

                lastGroup[1]--;
                if (lastGroup[1] == 0) {
                    groups.removeLast();
                }
            }

            answer += right - left + 1;
        }

        return answer;
    }
}
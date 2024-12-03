class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);

        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) zeroCount++;
        }

        if (zeroCount > 1) {
            Arrays.fill(answer, 0);
            return answer;
        }
        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) answer[i] = 0; 
                for(int j=0;j<n;j++){
                    if (j == i) continue;
                    answer[i]*=nums[j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue; 
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                if (nums[j] == 0) continue; 
                answer[i] *= nums[j];
            }
        }

        

        return answer;
    }
}

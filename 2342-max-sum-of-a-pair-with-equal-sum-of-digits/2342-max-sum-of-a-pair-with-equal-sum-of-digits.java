class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int current=nums[i];
            while(current!=0){
                sum+=current%10;
                current/=10;
            }
            map.putIfAbsent(sum, new ArrayList<>()); 
            map.get(sum).add(nums[i]);               
        }
        int result = -1;

        for (ArrayList<Integer> group : map.values()) {
            if (group.size() < 2) continue;

            int largest = -1;
            int secondLargest = -1;

            for (int num : group) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest) {
                    secondLargest = num;
                }
            }

            result = Math.max(result, largest + secondLargest);
        }

        return result;
        
    }
}
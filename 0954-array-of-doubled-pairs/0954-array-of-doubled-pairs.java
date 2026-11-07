class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Integer[] nums=map.keySet().toArray(new Integer[0]);
        Arrays.sort(nums,(a,b)->Integer.compare(Math.abs(a),Math.abs(b)));
        for(int num:nums){
            int remaining=map.get(num);
            if (num == 0) {
                if (remaining % 2 != 0) return false;
                continue;
            }
            int doubleCount=map.getOrDefault(num*2,0);

            if(doubleCount<remaining){
                return false;
            }
            map.put(num*2,doubleCount-remaining);
        }
        return true;
    }
}
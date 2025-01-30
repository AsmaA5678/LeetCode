class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> numbers=new HashSet<>();
        for(int num:nums){
            numbers.add(num);
        }
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);
        int count=1;
        int countMax=1;
        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)+1){
                count++;
            }else {
                countMax=Math.max(count,countMax);
                count=1;
            }
        }
        return Math.max(countMax,count);
    }
}

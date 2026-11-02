class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] count=new int[24];
        long result=0;
        for(int num:hours){
            int rest=num%24;
            int complement=(24-rest)%24;
            result+=count[complement];
            count[rest]++;
        }
        return result;
    }
}
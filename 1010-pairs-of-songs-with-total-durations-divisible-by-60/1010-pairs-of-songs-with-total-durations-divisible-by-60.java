class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count=new int[60];
        int result=0;
        for(int num:time){
            int rest=num%60;
            int complement=(60-rest)%60;
            result+=count[complement];
            count[rest]++;
        }
        return result;
    }
}
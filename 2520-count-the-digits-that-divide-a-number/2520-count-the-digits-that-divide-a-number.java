class Solution {
    public int countDigits(int num) {
        int count=0;
       int[] digits = String.valueOf(num)
                     .chars()
                     .map(c -> c - '0')
                     .toArray();
        for(int digit:digits){
            if(num%digit==0){
                count++;
            }
        }
        return count;
    }
}
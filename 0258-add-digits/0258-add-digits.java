class Solution {
    public int addDigits(int num) {
        int length = String.valueOf(Math.abs(num)).length();
        if(length==1) return num;
        int[] digits = String.valueOf(Math.abs(num))
                     .chars()
                     .map(c -> c - '0')
                     .toArray();
        int newNum=0;
        for(int digit: digits){
            newNum+=digit;
        }
        return addDigits(newNum);
    }
}
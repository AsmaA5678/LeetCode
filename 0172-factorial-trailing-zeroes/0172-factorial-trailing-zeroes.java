class Solution {
    public int trailingZeroes(int n) {
       int c=0;
       while (n>=5){
            n/=5;
            c+=n;
       }
       return c;
    }
}
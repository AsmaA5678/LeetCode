class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(i>=k){
                if(isVowel(s.charAt(i-k))){
                    count--;
                }
            }
            if(i>=k-1){
                if(count==k) return k;
                max=Math.max(count,max);
            }

        }
        return max;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
        }
}
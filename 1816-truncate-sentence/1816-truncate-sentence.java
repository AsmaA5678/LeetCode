class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        int i=0;
        while(i<s.length() && count!=k){
            if(s.charAt(i)==' '){
                count++;
            }
            i++;
        }
        if(i==s.length())return s;
        return s.substring(0,i-1);
        
    }
}
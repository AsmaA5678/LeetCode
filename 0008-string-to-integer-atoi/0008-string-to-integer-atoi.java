class Solution {
    public int myAtoi(String s) {
        long result=0;
        boolean negative=false;
        int i=0;
        if(s.length()==0) return 0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() &&  s.charAt(i)=='-'){
            negative=true;
            i++;
        }else if(i<s.length() &&  s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
           result=result*10+(s.charAt(i)-'0');
           if(!negative && result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(negative && -result<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
           i++;
        }
        
       return negative? (int)(-result):(int)result;
    }
}
class Solution {
    public int myAtoi(String s) {
        double result=0;
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
           i++;
        }
        if(negative==false && result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(negative==true && result*(-1)<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(negative) return (int) (result*-1);
        return (int)result;
    }
}
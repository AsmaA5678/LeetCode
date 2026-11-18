class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        int start=0;
        int end=0;
        while(end<s.length()){
           if(s.charAt(end)==' ' || end==s.length()-1){
                if(end==s.length()-1){
                    result.append(' ');
                }
                for (int i = end; i >= start; i--) {
                    result.append(s.charAt(i));
                }
                if(s.charAt(end)==' '){
                    start=end+1;
                }
           }
           end++;
        }
        return result.toString().substring(1);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
       String clean=cleanString(s);
       int start=0;
       int end=clean.length()-1;
       while(start<end){
        if(clean.charAt(start)==clean.charAt(end)){
            start++;
            end--;
        }else{
            return false;
        }
       }
       return true;
    }
    public static String cleanString(String s) {
        StringBuilder clean=new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean.append(c);
            }
        }
        return clean.toString();
    }
}
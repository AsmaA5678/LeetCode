class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minlength= Math.min(word1.length(),word2.length());
        StringBuilder result=new StringBuilder();
        for(int i=0;i<minlength;i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            for(int i=minlength;i<word1.length();i++){
                result.append(word1.charAt(i));
            }
        }else if(word1.length()<word2.length()){
            for(int i=minlength;i<word2.length();i++){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuffer result= new StringBuffer();
        String[] words = s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            result.append(" ");
            
        }
        return result.toString().trim();
    }
}
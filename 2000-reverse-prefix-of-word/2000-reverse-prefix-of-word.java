class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1)return word;
        StringBuilder result=new StringBuilder();
        int index=0;
        while(index<word.length()-1 && word.charAt(index)!=ch){
            index++;
        }
        for(int i=index;i>=0;i--){
            result.append(word.charAt(i));
        }
        result.append(word.substring(index+1));
        return result.toString();
    }
}
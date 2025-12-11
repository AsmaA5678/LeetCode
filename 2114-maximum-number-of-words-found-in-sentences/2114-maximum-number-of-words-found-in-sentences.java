class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int[] results=new int[n];
        for(int i=0;i<n;i++){
            results[i]=wordsFound(sentences[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,results[i]);
        }
        return max;
    }
    public int wordsFound(String sentence){
        int result=1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                result++;
            }
        }
        return result;
    }
}
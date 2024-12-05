class Solution {
    public String reverseWords(String s) {
        String result=reduceSpace(s);
        String[] words=result.split(" ");
        StringBuilder answer = new StringBuilder();
       for (int i= words.length-1;i>=0;i--){
        answer.append(words[i]);
        if(i!=0) answer.append(" ");
       }
        return answer.toString();

    }
    public String reduceSpace(String s){
        if(s==null || s.isEmpty()){
            return s;
        }

        StringBuilder result = new StringBuilder();
        boolean prevIsSpace=false;
        for(int i=0;i<s.length();i++){
            char curr =s.charAt(i);
            if(curr==' '){
                if(!prevIsSpace){
                    result.append(curr);
                }
                prevIsSpace=true;
            }else{
                result.append(curr);
                prevIsSpace=false;
            }
        }
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
        result.deleteCharAt(result.length() - 1);
        }
        if (result.length() > 0 && result.charAt(0) == ' ') {
        result.deleteCharAt(0);
        }
        return result.toString();
    }
}
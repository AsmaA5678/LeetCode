class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> map=new HashMap<>();
        int result=0;
        int c=0;
        for(int i=0; i<words.length;i++){
            if(map.getOrDefault(words[i],0)>0){
                result+=4;
                map.put(words[i],map.get(words[i])-1);
            }else{
                StringBuilder reverse=new StringBuilder();
                for(int j=1;j>=0;j--){
                    reverse.append(words[i].charAt(j));
                }
                map.put(reverse.toString(),map.getOrDefault(reverse.toString(),0)+1);
            }
        }
        for(String word:map.keySet()){
            if(map.get(word)!=0 && word.charAt(0)==word.charAt(1)){
                result+=2;
                break;
            }
        }
        return result;
    }
}
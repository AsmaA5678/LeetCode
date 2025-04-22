class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        int maxlength=0;
        int start=0;
        HashMap<Character,Integer> indexChar=new HashMap<>();
        for(int i=0;i<s.length();i++ ){
            int lastIndexOfChar=0;
            if(indexChar.containsKey(s.charAt(i))){
                lastIndexOfChar=indexChar.get(s.charAt(i));
                if(lastIndexOfChar>=start){
                    start=lastIndexOfChar+1;
                }
            }
            maxlength=Math.max(maxlength,(i-start+1));
            indexChar.put(s.charAt(i),i);
        }
        return maxlength;
    }
}
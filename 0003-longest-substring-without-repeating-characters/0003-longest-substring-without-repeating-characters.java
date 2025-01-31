class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxLength=Math.max(maxLength,end-start+1);            
        }
        
        return maxLength;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            int k=i;
            while(k<s.length() && !set.contains(s.charAt(k))){
                set.add(s.charAt(k));
                k++;
            }
            maxLength=Math.max(maxLength,s.substring(i, k).length());
            set.clear();
        }
        
        return maxLength;
    }
}
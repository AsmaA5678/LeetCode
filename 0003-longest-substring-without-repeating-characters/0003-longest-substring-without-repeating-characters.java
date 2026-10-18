class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen=new HashSet<>();
        int left=-1;
        int right=0;
        int max=0;
        while(right<s.length()){
            if(seen.contains(s.charAt(right))){
                while(seen.contains(s.charAt(right))){
                    left++;
                    seen.remove(s.charAt(left));
                }
            }
            seen.add(s.charAt(right));
            max=Math.max(max,right-left);
            right++;

        }
        return max;
    }
}
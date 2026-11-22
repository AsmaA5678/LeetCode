class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(i));
            }
            max=Math.max(i-start+1,max);
        }
        return max;
    }
}
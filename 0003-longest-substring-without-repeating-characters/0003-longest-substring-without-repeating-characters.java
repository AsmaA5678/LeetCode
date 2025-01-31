class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int k=i;
            while(k<s.length() && !set.contains(s.charAt(k))){
                set.add(s.charAt(k));
                k++;
            }
            list.add(i,s.substring(i, k));
            set.clear();
        }
        int maxLength=0;
        for(String str:list){
            maxLength=Math.max(maxLength,str.length());
        }
        return maxLength;
    }
}
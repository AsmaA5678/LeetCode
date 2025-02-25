class Solution {
    public int partitionString(String s) {
        HashSet<Character> seen= new HashSet<>();
        int result=1;
        for(int i=0;i<s.length();i++){
            if(seen.contains(s.charAt(i))){
                result++;
                seen.clear();
            }
            seen.add(s.charAt(i));
            
        }
        return result;
    }
}
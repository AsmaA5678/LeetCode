class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(s.length()<p.length()) return result;
        int[] pCount=new int[26];
        int[] sCount=new int[26];
        for(int i=0;i<p.length();i++){
            pCount[p.charAt(i)-'a']++;
            sCount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount, sCount)){
            result.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            sCount[s.charAt(i)-'a']++;
            sCount[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(pCount, sCount)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }

}
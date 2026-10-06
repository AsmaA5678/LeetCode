class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<Math.min(first.length() ,last.length())){
            if(first.charAt(i)!=last.charAt(i)){
                first=first.substring(0,i);
                break;
            }
            i++;
        }
        return first;
        
    }
}
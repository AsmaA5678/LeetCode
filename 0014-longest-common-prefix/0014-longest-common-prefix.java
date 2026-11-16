class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];

        for(int i=1;i<strs.length;i++){
            for(int j=0;j<first.length() && j<strs[i].length();j++){
                if(first.charAt(j)!=strs[i].charAt(j)){
                    first=first.substring(0,j);
                    break;
                }
            }
            if(first.length()>strs[i].length()){
                first=strs[i];
            }
        }
        return first;
    }
}
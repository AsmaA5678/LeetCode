class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<shortest.length()){
                shortest=strs[i];
            }
        }
        for(int i=0;i<strs.length;i++){

            for(int j=0;j<shortest.length();j++){
                if(shortest.charAt(j)!=strs[i].charAt(j)){
                    shortest=shortest.substring(0,j);
                    break;
                }
            }
        }
        return shortest;
    }
}
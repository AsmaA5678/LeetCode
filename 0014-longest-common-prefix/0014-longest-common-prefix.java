class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min= min(strs);
        String result="";
        int s= strs[min].length();
        if( s>-1){
            for (int i=0; i<strs.length; i++){
                for(int j=0; j<=s;j++){
                    if(strs[min].charAt(j)!= strs[i].charAt(j)){
                        s=j-1;
                        break;
                    }

                }
            }
        }
        if (s>=0){
            result=strs[0].substring(0,s); 
        }
        return result;
    }
    public int min(String[] strs){
        int min=0;
        for (int i=1; i<strs.length; i++) {
            if (strs[i].length() < strs[min].length()){
                min=i;
            }
        }
        return min;
    }
}
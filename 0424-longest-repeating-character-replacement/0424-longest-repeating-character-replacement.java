class Solution {
    public int characterReplacement(String s, int k) {       
        int[] count=new int[26];
        int max=Integer.MIN_VALUE;
        int mostSeen=0;
        int i=0;
        int left=-1;
        while(i<s.length()){
            count[s.charAt(i)-'A']++;
            mostSeen=Math.max(mostSeen,count[s.charAt(i)-'A']);
            if(i-left-mostSeen<=k){
                max=Math.max(max,i-left);
            }
            while(i-left-mostSeen>k){
                left++;
                count[s.charAt(left)-'A']--;
            }
            i++;
        }
        return max;
    }
    
}
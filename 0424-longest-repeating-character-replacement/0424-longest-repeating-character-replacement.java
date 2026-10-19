class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=-1;
        int right=0;
        int max=0;
        while(right<s.length()){
            count[s.charAt(right)-'A']++;
            if(right-left-highestLetter(count)<=k){
                max=Math.max(max,right-left);
            }
            while(right-left-highestLetter(count)>k){
                left++;
                count[s.charAt(left)-'A']--;
            }
            right++;
        }
        return max;
        
    }
    public int highestLetter(int[] count){
        int max=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
            }
        }
        return max; 
    }
}
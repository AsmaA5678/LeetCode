class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=-1;
        int right=0;
        int max=0;
        int highest=0;
        while(right<s.length()){
            count[s.charAt(right)-'A']++;
            highest = Math.max(highest, count[s.charAt(right) - 'A']);
            if(right-left-highest<=k){
                max=Math.max(max,right-left);
            }
            while(right-left-highest>k){
                left++;
                count[s.charAt(left)-'A']--;
            }
            right++;
        }
        return max;
        
    }
    
}
class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                count++;
            }
            if(i>=k){
                if("aeiouAEIOU".indexOf(s.charAt(i-k))!=-1){
                    count--;
                }
            }
            if(i>=k-1){
                if(count==k) return k;
                max=Math.max(count,max);
            }

        }
        return max;
    }
}
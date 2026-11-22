class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int[] count=new int[26];
        while(i<s.length()){
            if("oeuiaOEUIA".indexOf(s.charAt(i))!=-1){
                sum++;
            }
            if(i>=k){
                if("oeuiaOEUIA".indexOf(s.charAt(i-k))!=-1){
                    sum--;
                }
            }
            if(i>=(k-1)){
                max=Math.max(max,sum);
                if(max==k) return k;
            }
            i++;
        }
        return max;
    }
}
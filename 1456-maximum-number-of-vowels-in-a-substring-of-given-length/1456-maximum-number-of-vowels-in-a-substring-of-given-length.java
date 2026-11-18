class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int i=0;
        int max=0;
        int sum=0;
        while(i<s.length()){
            if("aoeuiAOUIE".indexOf(s.charAt(i))!=-1){
                sum++;
            }
            if(i>=k){
                if("aoeuiAOUIE".indexOf(s.charAt(i-k))!=-1){
                    sum--;
                }
            }
            if(i>=k-1){
            max=Math.max(max,sum);

            }
            if(max==k)return k;
            i++;
        }
        return max;
    }
}
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String previous=countAndSay(n-1);
        StringBuilder result=new StringBuilder();
        int i=0;
        while(i<previous.length()){
            int j=i;
            while(j<previous.length() && previous.charAt(j)==previous.charAt(i)){
                j++;
            }
            int count=j-i;
            result.append(count);
            result.append(previous.charAt(i));
            i=j;
        }
        return result.toString();

    }
}
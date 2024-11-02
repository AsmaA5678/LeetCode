class Solution {
    public boolean isPalindrome(int x) {
        if(Math.abs(x)!=x){
            return false;
        }
        String xStr = Integer.toString(x);
        //String str = x + "";
        char[] xArray = xStr.toCharArray();
        for(int i=0; i<xArray.length/2;i++){
            if(xArray[i]!=xArray[xArray.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int reverse(int x) {
        int current=x;
        int result=0;
        while(current!=0){
            if(result>Integer.MAX_VALUE/10) return 0;
            if(result==Integer.MAX_VALUE/10 && current%10>7) return 0;
            if(result<Integer.MIN_VALUE/10) return 0;
            if(result==Integer.MIN_VALUE/10 && current%10<-8) return 0;
            result=result*10+current%10;
            current=current/10;
        }
        return result;
    }
}
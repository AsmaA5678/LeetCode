class Solution {
    public int maxProfit(int[] prices) {
        int a= prices[0];
        int result=0;
        for(int i : prices ){
            if(i<a){
                a=i;
            }
            if(a<i && i-a > result){
                result=i-a;
            }
        }
        return result;
        
    }
}
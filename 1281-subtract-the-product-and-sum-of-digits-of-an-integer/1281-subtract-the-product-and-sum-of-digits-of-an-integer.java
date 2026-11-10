class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int current=n;
        while(current!=0){
            sum+=current%10;
            product*=current%10;
            current/=10;
        }
        return product-sum;
        
    }
}
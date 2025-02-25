class Solution {
    public int kthFactor(int n, int k) {
        int i=1;
        int kthfact=1;
        int count=1;
        while(i<=n){
            if(n%i==0){
                if(count==k){
                return i;
                }
                count++;
            }
            i++;
        }
        return -1;
    }
}
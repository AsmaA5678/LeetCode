class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] min= new int[amount+1];
        Arrays.fill(min,amount+1);
        min[0]=0;
        for(int i=0;i<amount+1;i++){
            for(int coin:coins){ 
                if(i-coin>=0){
                min[i]=Math.min(min[i],1+min[i-coin]);
                }
            }
        }
        if(min[amount]==amount+1) return -1;
        return min[amount];
        
    }
}
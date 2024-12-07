class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(!condition(gas,cost)) return -1;
        int n= cost.length;
        int total=0;
        int start=0;
        int[] diff=difference(gas, cost);
        for (int j=0;j<n;j++){
            total+=diff[j];
            if(total<0){
                total=0;
                start=j+1;
            }
        }
        return start;
        
    }
    public int[] difference(int[] gas, int[] cost) {
        int n= cost.length;
        int[] diff=new int[n];
        for (int j=0;j<n;j++){
            diff[j]=gas[j]-cost[j];
        }
        return diff;
    }
    public boolean condition(int[] gas, int[] cost) {
        int n= cost.length;
        int totalGas=0;
        int totalCost=0;
        for (int j=0;j<n;j++){
           totalGas+=gas[j];
           totalCost+=cost[j];
        }
        return totalGas>=totalCost;

    }
}
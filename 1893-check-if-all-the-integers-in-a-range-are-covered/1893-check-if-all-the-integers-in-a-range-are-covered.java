class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges,(a,b)->Integer.compare(a[0],b[0]));
        int current=left;
        for(int[] range:ranges){
            if(range[0]>current) return false;
            if(range[1]>=current){
                current=range[1]+1;
            }
            if(current>right) return true;
        }
        return false;
    }
}
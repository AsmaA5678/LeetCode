class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges,(a,b)->Integer.compare(a[0],b[0]));
        int j=0;
        int i=left;
        while(j<ranges.length){
            while(j<ranges.length && i<=right && i>=ranges[j][0] && i<=ranges[j][1]){
                i++;
            }
            j++;
        }
        if(i<=right) return false;
        return true;       
    }
}
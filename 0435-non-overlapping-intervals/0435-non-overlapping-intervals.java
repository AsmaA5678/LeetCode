class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int[] current=intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<current[1]){
                count++;
            }else{
                current=intervals[i];
            }
            
        }
        return count;
    }
}
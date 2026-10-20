class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            int comparison = Integer.compare(a[0], b[0]);
            if (comparison == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return comparison;
        });        
        int result=0;
        int k=0;
        for(int i=0;i<intervals.length;i+=k+1){
            k=0;
            int[] current=intervals[i];
            while(k+i+1<intervals.length && current[1]>intervals[k+i+1][0]){
                result++;
                if(intervals[k+i+1][1]<current[1]){
                    current=intervals[k+i+1];
                }
                k++;
            }
        }
        return result;
    }
}
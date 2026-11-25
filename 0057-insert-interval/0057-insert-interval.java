class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] intervals2=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            intervals2[i]=intervals[i];
        }
        intervals2[intervals.length]=newInterval;
        Arrays.sort(intervals2,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        int i=0;
        while(i<intervals2.length){
            int j=i+1;
            int start=intervals2[i][0];
            int end=intervals2[i][1];
            while(j<intervals2.length && end>=intervals2[j][0]){
                end=Math.max(end,intervals2[j][1]);
                j++;
            }
            result.add(new int[]{start,end});
            i=j;
        }
        return result.toArray(new int[result.size()][]);
        
    }
}
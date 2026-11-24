class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        int i=0;
        while(i<intervals.length){
            int j=i+1;
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(j<intervals.length && end>=intervals[j][0]){
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            result.add(new int[]{start,end});
            i=j;
        }
        return result.toArray(new int[result.size()][]);
    }
}
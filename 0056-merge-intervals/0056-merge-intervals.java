class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        int k=0;
        for(int i=0;i<intervals.length;i+=k+1){
            int[] current=intervals[i];
            k=0;
            while(i+k+1<intervals.length && current[1]>=intervals[i+k+1][0]){
                current=new int[]{current[0],Math.max(current[1],intervals[i+k+1][1])};
                k++;
            }
            result.add(current);
        }
        return result.toArray(new int[result.size()][]);
        
    }
}
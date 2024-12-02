class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations); 
        int s = 0;
        int h = 0; 
        for (int i = 0; i < n; i++) {
            s = n - i;
            if (citations[i] >= s) {
                h = s; 
                break; 
            }
        }

        return h;
    }
}

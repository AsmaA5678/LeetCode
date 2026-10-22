class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[1], a[1])
        );
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                heap.offer(new int[]{'a' + i, count[i]});
            }
        }
        int[] previous=null;
        while(!heap.isEmpty()){
            int[] current=heap.poll();
            result.append((char)current[0]);
            current[1]--;

            if(previous!=null && previous[1]>0){
                heap.offer(previous);
            }

            previous=current;
        }
        return result.length()==s.length()?result.toString():"";
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            heap.offer(stone);
        }
        while(heap.size()>1){
            int current=heap.poll();
            int next=heap.poll();
            if(current!=next){
                heap.offer(current-next);
            }
        }
        if(heap.isEmpty()) return 0;
        return heap.peek();
    }
}
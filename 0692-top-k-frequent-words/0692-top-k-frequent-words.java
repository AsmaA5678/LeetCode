class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> count=new HashMap<>();
        for(int i=0;i<words.length;i++){
            count.put(words[i],count.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<String> heap=new PriorityQueue<>((a,b)->{
            int comparison=Integer.compare(count.get(a),count.get(b));
            if(comparison==0){
            return b.compareTo(a);
            } 
            return comparison;
           
        });
        
        for(String word : count.keySet()){
            heap.offer(word);
            if(heap.size()>k){
                heap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
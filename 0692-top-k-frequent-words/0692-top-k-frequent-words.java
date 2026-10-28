class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> count=new HashMap<>();
        for(int i=0;i<words.length;i++){
            count.put(words[i],count.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<String> heap=new PriorityQueue<>((a,b)->{
            int comparison=Integer.compare(count.get(b),count.get(a));
            if(comparison==0){
            return a.compareTo(b);
            } 
            return comparison;
           
        });
        
        heap.addAll(count.keySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(heap.poll());
        }

        return result;
    }
}
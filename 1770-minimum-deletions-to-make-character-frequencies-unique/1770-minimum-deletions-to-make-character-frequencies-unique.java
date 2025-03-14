class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1) ;
        }
        List<Integer> valuesList = new ArrayList<>(map.values()); //map.values()
        
        HashSet<Integer> freq=new HashSet<>();
        for(int i=0;i<valuesList.size();i++){
            int currentfreq=valuesList.get(i);
            while(currentfreq>0 && freq.contains(currentfreq)){
                currentfreq--;
                count++;
            }
            freq.add(currentfreq);
        }
        return count;
    }
}
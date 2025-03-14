class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1) ;
        }
       List<Integer> keysList = new ArrayList<>(map.values()); //map.values()
        Collections.sort(keysList);
        for(int i=keysList.size()-1;i>0;i--){
            if(keysList.get(i)==keysList.get(i-1)){
                keysList.set(i-1,keysList.get(i)-1);
                count++;
            }
        }
        return count;
    }
}
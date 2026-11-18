class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
           char[] chars=s.toCharArray();
           Arrays.sort(chars);
           String sorted=new String(chars);
           List<String> current=map.getOrDefault(sorted,new ArrayList<>());
           current.add(s);
           map.put(sorted,current);
        }
        return new ArrayList<>(map.values());
    }
}
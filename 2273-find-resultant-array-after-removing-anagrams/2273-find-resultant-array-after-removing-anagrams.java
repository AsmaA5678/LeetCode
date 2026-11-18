class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        result.add(words[0]);
        char[] chars=words[0].toCharArray();
        Arrays.sort(chars);
        String current=new String(chars);
        int i=1;
        while(i<words.length){
            chars=words[i].toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(!sorted.equals(current)){
                current=sorted;
                result.add(words[i]);
            }
            i++;
        }
        return result;
    }
}
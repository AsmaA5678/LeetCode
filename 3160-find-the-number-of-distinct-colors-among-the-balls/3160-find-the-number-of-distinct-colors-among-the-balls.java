class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> colorFrequency=new HashMap<>();
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(map.containsKey(queries[i][0])){
                int currColor=map.get(queries[i][0]);
                colorFrequency.put(currColor,colorFrequency.get(currColor)-1);
                if(colorFrequency.get(currColor)==0){
                    colorFrequency.remove(currColor);
                }
            }
            map.put(queries[i][0],queries[i][1]);
            colorFrequency.put(queries[i][1],colorFrequency.getOrDefault(queries[i][1],0)+1);
            result[i]=colorFrequency.size();
        }
        return result;
    }
}
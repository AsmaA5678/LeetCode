class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(nums.get(i).get(j));
                n++;
            }
        }
        int[] result=new int[n];
        int c=0;
        for(int i=0;i<map.size();i++){
            for(int j=map.get(i).size()-1;j>=0;j--){
                result[c]=map.get(i).get(j);
                c++;
            }
        }
        return result;
    }
}
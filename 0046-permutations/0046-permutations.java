class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>() , nums);
        return result;   
    }
    public void backtrack(List<List<Integer>> result, ArrayList<Integer> visited,int[] nums){

        if(visited.size()==nums.length){
            result.add(new ArrayList<>(visited));
            return;
        }
        for(int number : nums){
            if(visited.contains(number)){
                continue;
            }
            visited.add(number);
            backtrack(result, visited,nums);
            visited.remove(visited.size()-1);


        }
    }
}
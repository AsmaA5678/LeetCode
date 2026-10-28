class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            for(int d=2;d<=num/d;d++){
                if(num%d==0){
                    seen.add(d);
                    while(num%d==0){
                        num=num/d;
                    }
                }
            }
            if(num>1){
                seen.add(num);
            }

        }
        return seen.size();
        
    }
}
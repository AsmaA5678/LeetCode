class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] nbJumps=new int[n];
        Arrays.fill(nbJumps,Integer.MAX_VALUE);
        nbJumps[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min=Math.min(min,nbJumps[j]);
            }
            if(min!=Integer.MAX_VALUE) nbJumps[i]=min+1;
        }
        return nbJumps[0];
    }
    
}
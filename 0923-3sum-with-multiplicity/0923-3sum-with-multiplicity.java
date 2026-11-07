class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long result=0;
        final int MOD = 1_000_000_007;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]==target){
                    if(arr[left]==arr[right]){
                        int m=right-left+1;
                        result=(result+(long)m*(m-1)/2)%MOD;
                        break;
                    }else{ 
                        int x=1;
                        while(left<right && arr[left]==arr[left+1]){
                            x++;
                            left++;
                        } 
                        int y=1;
                        while(left<right && arr[right]==arr[right-1]){
                            y++;
                            right--;
                        }
                        result=(result+(long)x*y)%MOD;
                        right--;
                        left++;
                    }
                }else if(arr[i]+arr[left]+arr[right]>target){
                    right--;
                }else{
                    left++;
                }
            }
            
        }
        return (int)result;
        
    }
}
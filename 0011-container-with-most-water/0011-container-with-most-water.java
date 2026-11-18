class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int max=0;
        while(left<right){
            int area=Math.min(height[right],height[left])*(right-left);
            max=Math.max(max,area);
            if(height[right]>height[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
        
    }
}
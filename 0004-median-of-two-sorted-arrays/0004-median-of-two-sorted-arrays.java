class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sorted=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            sorted[i]=nums1[i];
        }
        for(int i=nums1.length;i<sorted.length;i++){
            sorted[i]=nums2[i-nums1.length];
        }
        Arrays.sort(sorted);
        if((nums1.length+nums2.length)%2==1){
            return (double) sorted[(nums1.length+nums2.length)/2];
        }else{
            int first=sorted[(nums1.length+nums2.length)/2];
            int second=sorted[(nums1.length+nums2.length)/2-1];
            return (double) (first+second)/2;
        }
    }
}
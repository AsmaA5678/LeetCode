class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] sorted=new int[n+m];
        int i=0;
        int j=0;
        int c=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                sorted[c]=nums1[i];
                c++;
                i++;
            }else{
                sorted[c]=nums2[j];
                c++;
                j++;
            }
        }
        while(i<n){
            sorted[c]=nums1[i];
            c++;
            i++;
        }
        while(j<m){
            sorted[c]=nums2[j];
            c++;
            j++;
        }
        
        if((n+m)%2==1){
            return (double) sorted[(n+m)/2];
        }else{
            int first=sorted[(n+m)/2];
            int second=sorted[(n+m)/2-1];
            return (double) (first+second)/2;
        }
    }
}
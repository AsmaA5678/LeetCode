class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int c=0;
        int first=0;
        int second=0;
        int current=0;

        while(i<n && j<m && c<=(n+m)/2){
            if(nums1[i]<=nums2[j]){
                current=nums1[i];
                i++;
            }else{
                current=nums2[j];
                j++;
            }

            if(c==(n+m)/2-1){
                first=current;
            }else if(c==(n+m)/2){
                second=current;
            }
            c++;
        }

        while(i<n && c<=(n+m)/2){
            current=nums1[i];
            if(c==(n+m)/2-1){
                first=current;
            }else if(c==(n+m)/2){
                second=current;
            }
            c++;
            i++;
        }

        while(j<m && c<=(n+m)/2){
            current=nums2[j];
            if(c==(n+m)/2-1){
                first=current;
            }else if(c==(n+m)/2){
                second=current;
            }
            c++;
            j++;
        }

        if((n+m)%2==1){
            return (double) second;
        }else{
            return ((double) first+second)/2;
        }
    }
}
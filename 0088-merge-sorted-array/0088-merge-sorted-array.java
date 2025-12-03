class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m+n-1;
        int k1 = m-1;
        int k2= n-1;
        while(i>=0){
            if(k1>=0 && k2>=0){
                if( nums1[k1]>nums2[k2]){
                    nums1[i]=nums1[k1];
                    k1--;
                }else if(nums1[k1]<=nums2[k2]){
                    nums1[i]=nums2[k2];
                    k2--;
                }
            }else if(k1<0){
                nums1[i]=nums2[k2];
                k2--;
            }else if(k2<0){
                nums1[i]=nums1[k1];
                k1--;
            }
            i--;
        }

    }
}

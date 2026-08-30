class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int m = nums1.length;
        int n = nums2.length;
        int f = m+n;
        int temp[] = new int[f];

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[k++] = nums1[i++];
            }else{
                temp[k++] = nums2[j++];
            }
        }
        while(i<m){
            temp[k++] = nums1[i++];
        }
        while(j<n){
            temp[k++] = nums2[j++];
        }

        if(f % 2 !=0){
            return (double) temp[f/2];
        }
        return (double)(temp[f/2 - 1] + temp[f/2])/2.0;
    }
}

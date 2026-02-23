package JavaNangCao.leetcode.leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i=0, j=0, k=0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < m){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        //arr is merged
        if (arr.length % 2 == 0){
            return (double) (arr[arr.length / 2] + arr[arr.length / 2 + 1]) / 2;
        }
        else {
            return (double) arr[(arr.length + 1) / 2];
        }

    }
}

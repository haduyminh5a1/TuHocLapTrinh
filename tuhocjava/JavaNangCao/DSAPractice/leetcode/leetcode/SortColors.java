package JavaNangCao.DSAPractice.leetcode.leetcode;

public class SortColors {
    public static void sortColors(int[] nums){
        int n = nums.length;
        if (n < 2) return;
        int middle = n / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[n - middle];

        for (int i=0;i<middle;i++){
            leftHalf[i] = nums[i];
        }
        for (int i=middle;i<n;i++){
            rightHalf[i-middle] = nums[i];
        }

        sortColors(leftHalf);
        sortColors(rightHalf);

        merge(leftHalf, rightHalf, nums);
    }
    public static void merge(int[] leftHalf, int[] rightHalf, int[] nums){
        int i=0, j=0, k=0;
        int n = leftHalf.length;
        int m = rightHalf.length;

        while (i < n && j < m){
            if (leftHalf[i] <= rightHalf[j]){
                nums[k] = leftHalf[i];
                i++;
            }
            else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < n){
            nums[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < m){
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}

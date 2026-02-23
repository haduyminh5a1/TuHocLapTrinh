package JavaNangCao.Algorithms;
import java.util.*;

public class MergeSort {
    public static void mergeSort(int[] arr){
        int n = arr.length;

        if (n < 2) {
            return;
        }

        int middle = n/2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[n-middle];
        
        for (int i=0;i<middle;i++){
            leftHalf[i] = arr[i];
        }
        for (int i=middle;i<n;i++){
            rightHalf[i - middle] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf){
        int n = leftHalf.length;
        int m = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < n && j < m){
            if (leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < n){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < m){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] nums = new int[10];

        for (int i=0;i<10;i++){
            nums[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(nums));

        mergeSort(nums);
        System.out.println();

        System.out.println(Arrays.toString(nums));
    }
}

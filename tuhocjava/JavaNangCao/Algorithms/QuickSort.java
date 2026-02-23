package JavaNangCao.Algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] nums, int lowIndex, int highIndex){
        int pivot = nums[highIndex];

        int left = lowIndex;
        int right = highIndex;

        while (left < right) {
            while (nums[left] <= pivot && left < right){
                left++;
            }
        }
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] nums = new int[100];

        for (int i=0;i<nums.length;i++){
            nums[i] = rnd.nextInt(10000);
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(nums));
    }
}

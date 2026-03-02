package JavaNangCao.DSAPractice.leetcode.leetcode;

public class SortIntegersByTheNumberOf1Bits {
    public static int[] sortByBits(int[] arr){
        int[] bitArr = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            bitArr[i] = Integer.bitCount(arr[i]);
        }
        
    }
}

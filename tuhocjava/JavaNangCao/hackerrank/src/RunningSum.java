import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        for (int i=0;i<n-1;i++){
            arr[i+1] += arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

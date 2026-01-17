package LuyenThi;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = input.nextInt();
        int[] soHang = new int[n];
        for (int i=0;i<n;i++){
            soHang[i] = input.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i=0;i<n;i++){
            if (soHang[i]%3 == 0){
                sum += soHang[i];
                count++;
            }
        }
        int maxValue = soHang[0];
        for (int value : soHang){
            if (maxValue<value){
                maxValue = value;
            }
        }
        System.out.println("Nhap vao so hang ban can tim vi tri: ");
        int x = input.nextInt();
        int index = 0;
        for (int i=0;i<n;i++){
            if (x == soHang[i]){
                index = i;
            }
        }

        System.out.println(sum);
        System.out.println(sum/count);
        System.out.println(maxValue);
        System.out.println(binarySearch(soHang, x));
        System.out.println(index);
    }
    public static int binarySearch(int[] soHang, int x){
        int low = 0;
        int high = 0;
        while (low<=high){
            int mid = low + (high-low)/2;

            if (soHang[mid] == x){
                return mid;
            }
            else if (soHang[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

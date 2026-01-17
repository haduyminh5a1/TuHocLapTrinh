import java.util.*;

public class DayConTangDan {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++){
            int value = input.nextInt();
            arr1[i] = value;
        }
        int[] L = new int[arr1.length];
        Arrays.fill(L, 1);
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<i;j++){
                if (arr1[i]>arr1[j]){
                    L[i] = Math.max(L[i], L[j]+1);
                }
            }
        }
        int maxLength = L[0];
        for (int i=0;i<L.length;i++){
            if (L[i]>maxLength){
                maxLength = L[i];
            }
        }
        System.out.println(maxLength);*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int length = 0;
        for (int i=0;i<n;i++){
            int value = input.nextInt();
            a[i] = value;
        }
        for (int x : a){
            int postion = Arrays.binarySearch(b,0,length,x);
            if (postion<0) postion = -postion -1;
            b[postion] = x;
            if (postion == length) length++;
        }
        System.out.println(length);
    }
}

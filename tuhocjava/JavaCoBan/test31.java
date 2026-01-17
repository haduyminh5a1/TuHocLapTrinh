
import java.util.Arrays;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // int[] N = new int[n];
        // System.out.println(N.length);
        // for (int i=0; i<N.length; i++){
        //     System.out.println("M[" + i + "] = ");
        //     N[i] = input.nextInt();
        // }
        // System.out.println("Mang M duoc tao là: ");
        // System.out.println(Arrays.toString(N));
        // int m = input.nextInt();
        // int[] M = new int[m];
        // for (int i=0;i<M.length;i++){
        //     System.out.println("M[" + i + "]");
        //     M[i] = input.nextInt();
        // }
        // Arrays.sort(M);
        // System.out.println(Arrays.toString(M));
        int q = input.nextInt();
        int[] Q = new int[q];
        for (int i=0;i<Q.length;i++){
            System.out.println("M[" + i + "]");
            Q[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(Q));
        for (int i=0, j=Q.length-1; i<j; i++, j--){
            int temp = Q[i];
            Q[i] = Q[j];
            Q[j] = temp;
        }
        System.out.println(Arrays.toString(Q));
        Arrays.sort(Q);
        System.out.println(Arrays.toString(Q));
        int sum = 0;
        for (int i=0;i<Q.length;i++){
            sum += Q[i];
        }
        System.out.println(sum);
        int kiemTra = input.nextInt();
        for (int i=0;i<Q.length;i++){
            if(kiemTra==Q[i]){
                System.out.println(Q[i]);
            }
        }
    }
}

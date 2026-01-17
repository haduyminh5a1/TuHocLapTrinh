
import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Nhap so n: ");
        // int n = input.nextInt();
        for (int n=1;n<=1000;n++){
            int tong = 0;
            for (int i=1;i<n;i++){   
                if (n%i==0) {
                    tong+=i;           
            }
        }
        if (tong==n)
                System.out.println(n + " la so hoan hao");
        }
    }
}
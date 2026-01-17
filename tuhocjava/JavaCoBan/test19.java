
import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tu nhien n: ");
        int n = input.nextInt();
        int giaiThua=1;
        int a=1;
        for (int i=1;i<=n;i++)
        {
            giaiThua*=i;
        }
        System.out.println("giai thua: " + giaiThua);
        // while (a<=n)
        // {
        //     giaiThua*=a;
        //     a++;
        // }
        // System.out.println("giai thua: " + giaiThua);
}
}

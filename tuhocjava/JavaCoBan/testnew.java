
import java.util.Scanner;

public class testnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        long tongLe=0;
        long tongChan=0;
        for (int i=0;i<n;i++){
            long soHang = sc.nextLong();
            if (i%2==0){
                tongLe+=soHang;
            }
            else
                tongChan+=soHang;
        }
        System.out.println(tongChan-tongLe);
    }
}


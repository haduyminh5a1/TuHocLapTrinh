
import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("vui long nhap so nguyen a>0: ");
            int a = input.nextInt();
            int bienSo=0;
            if (a<=0){
                System.out.println("Day khong phai so hop le" +
                                    "\nVui long nhap lai");
                a = input.nextInt();
            }
            if (a==1){
                System.out.println("1 khong phai la so nguyen to");
            }
            else {
                for (int i=1;i<=a;i++){
                    if (a%i==0){
                        bienSo++;
                    }
                }
                if (bienSo==2)
                    System.out.println("Day la so nguyen to");
                else 
                    System.out.println("Day khong phai so nguyen to");
            }
            
            System.out.println("Ban muon dung khong? (Y neu ban muon dung)");
            String xacNhan = new Scanner(System.in).nextLine();
            if (xacNhan.equals("Y") || xacNhan.equals("y"))
                break;
        }
    }
    
}


import java.util.Scanner;

public class test20 {
public static void main(String[] args) {
    double tong = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap mot so chan de tinh tong cac so chan tu 0: ");
    double a = input.nextDouble();
    if (a%2==0){
        for (double i=0;i<=a;i+=2){
            tong+=i;}
        System.out.println("Tong cac so chan la: " + tong); }
    
    else{
        System.out.println("Chi tinh tong cac so chan");
    }
}
}


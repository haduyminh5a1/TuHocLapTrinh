import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
    double tong = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap mot so chan de tinh tong cac so le: ");
    double a = input.nextDouble();
    for (double i=1;i<=a;i+=2){
        if (i==3)
        continue;
        tong+=i;
        
    }
    System.out.println(tong);
    }
}

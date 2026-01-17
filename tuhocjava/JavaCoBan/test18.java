
import java.util.Scanner;

public class test18 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Vui long nhap cac canh cua tam giac lan luot a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // Xét cạnh tam giác khi các cạnh tạo thành tam giác
        if (a+b>c && a+c>b && b+c>a)
        {
            // Xét các trường hợp có cạnh bằng nhau 
            if (a==b || b==c || a==c)
            {
                //Trường hợp các cạnh trong tam giác đều bằng nhau nên đây là tam giác đều
                if (a==b && b==c)
                {
                    System.out.println("Day la tam giac deu");
                }
                //Trường hợp tam giác vuông cân
                else if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a )
                {
                    System.out.println("Day la tam giac vuong can");
                }
                //Trường hợp tam giác cân
                else
                    System.out.println("Day la tam giac can");
            }
            //Trường hợp các cạnh của tam giác tạo thành tam giác vuông
            else if ( a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a )
                    System.out.println("Day la tam giac vuong");
            //Trường hợp các cạnh của tam giác không có gì đặc biệt
            else 
                    System.out.println("Day la tam giac thuong");
        }
        // Các cạnh không tạo thành tam giác
        else 
        {
            System.out.println("Day khong phai la tam giac");
        }
            
    }
}

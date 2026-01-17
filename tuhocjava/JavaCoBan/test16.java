
import java.util.Scanner;
public class test16 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so diem cua ban: ");
        int score = input.nextInt();
        if (score>=90)
        {
            System.out.println("Gioi");
        }
        else if (score>=80)
        {
            System.out.println("Kha");
        }
        else if (score>=65)
        {
            System.out.println("Trung Binh");
        }
        else
        System.out.println("Yeu");
}
    
}

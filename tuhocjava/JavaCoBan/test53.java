
import java.util.Scanner;

public class test53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nhapVao = input.nextLine();
        StringBuilder s = new StringBuilder(nhapVao);
        if (nhapVao.equals(s.reverse().toString())){
            System.out.println("Day la mot chuoi Panlydrome");
        }
        else
            System.out.println("Day khong phai mot chuoi Panlydrome");
    }
}

import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so diem cua ban: ");
        int diem = input.nextInt();
        String xepLoai = (diem<5)? "Yeu": 
                         (diem<=6.5)? "Trung binh":
                         (diem<8)? "Kha":
                         "Tot";
        System.out.println("Ban dat loai " + xepLoai);
    }
}

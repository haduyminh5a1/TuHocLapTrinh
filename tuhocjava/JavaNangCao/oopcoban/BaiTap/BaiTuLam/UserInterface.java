package BaiTap.BaiTuLam;
import java.io.*;
import java.util.*;

public class UserInterface {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Chao mung den voi he thong quan ly phong gym!");
        System.out.println("Moi ban dua ra lua chon cua minh: ");
        System.out.println("1.Dang ki thanh vien (Danh cho nguoi moi)\n2.Dang nhap vao tai khoan\n3.Dang ki goi membership");
        int n = input.nextInt();



        if (n == 3){
            System.out.println("Chao mung den voi phan dang ki goi membership!");
            System.out.println("Moi dua ra lua chon cho goi cua ban: \n1.Goi member thuong\n2.Goi Premium\n3.Goi Premium with Trainer");
            n = input.nextInt();
            if (n == 1){
                int stt = 1;
                System.out.println("Ban da chon goi 1: ");
                System.out.println("Thong tin ve goi: ");
                System.out.println("---");
                System.out.println("Moi ban nhap thong tin: ");
                String name = input.nextLine();
                String id = input.nextLine();
                String info = input.nextLine();
                BasicMember mem1 = new BasicMember(name, id, info);
            }
        }
    }
}   

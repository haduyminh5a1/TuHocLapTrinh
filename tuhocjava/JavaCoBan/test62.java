
import java.util.*;

public class test62 {
    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<>(){{
            put("user1", "123456");
            put("user2", "123456");
            put("user3", "123456");
            put("user4", "123456");
            put("user5", "123456");
            put("user6", "123456");
            put("user7", "123456");
            put("user8", "123456");
            put("user9", "123456");
            put("user10", "123456");
        }};
        Scanner input = new Scanner(System.in);
        System.out.print("Moi nhap tai khoan dang nhap: ");
        String taiKhoan = input.nextLine();
        System.out.println("Moi nhap mat khau: ");
        String matkhau = input.nextLine();
        while (!user.containsKey(taiKhoan)){
            System.out.println("Ten nguoi dung khong ton tai, vui long nhap lai: ");
            taiKhoan = input.nextLine();
        }
        while (!user.containsValue(matkhau)){
            System.out.println("Mat khau khong dung, vui long nhap lai: ");
            matkhau = input.nextLine();
        }
        System.out.println("Dang nhap thanh cong!!!");
    }
}


import java.util.Scanner;

public class test48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vui long nhap mat khau\n" + 
                                "Mat khau gom it nhat 6 ki tu, chua it nhat 1 chu cai va 1 chu so: ");
        String matKhau = input.nextLine();
        while (matKhau.length()<6){
            System.out.println("Mat khau khong hop le, vui long nhap lai: ");
            matKhau = input.nextLine();
        }
        if (kiemTra(matKhau))
            System.out.println("Mat khau hop le");
        else 
            System.out.println("Mat khau khong hop le");
        System.out.println("Da hoan thanh xac nhan mat khau, vui long dang nhap lai.\n"
                                + "Hay nhap lai mat khau: ");
        String nhapLai = input.nextLine();
        int lanNhapLai = 0;
        if (!matKhau.equals(nhapLai)){
            for (int i=0;i<5;i++){
                System.out.println("Mat khau sai, vui long nhap lai: ");
                nhapLai = input.nextLine();
                lanNhapLai++;
                if (lanNhapLai==5){
                    System.out.println("Nhap sai qua 5 lan, tai khoan bi khoa");
                    break;
                }
                else if (nhapLai.equals(matKhau)){
                    System.out.println("Dang nhap thanh cong");
                    break;
                }
            }   
        }
        else
            System.out.println("Dang nhap thanh cong!");
    }
    static Boolean kiemTra(String n){
        int chuSo=0;
        int chuHoa=0;
        int chuThuong=0;
        if (n == null || n.isEmpty()) {
        return false;
        }
        for (int i=0;i<n.length();i++){
            char s = n.charAt(i);
            if (Character.isUpperCase(s))
                chuHoa++;
            else if (Character.isLowerCase(s))
                chuThuong++;
            else if (Character.isDigit(s))
                chuSo++;
        }
        boolean ketQua=true;
        if (chuHoa<1 || chuThuong<1 || chuSo<1){
            ketQua=false;
        }
        return ketQua;
    }

}

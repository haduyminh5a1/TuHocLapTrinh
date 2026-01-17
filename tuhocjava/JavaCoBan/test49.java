import java.util.Scanner;

public class test49 {
    public static void main(String[] args) {
    /*     Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can ma hoa: ");
        String nhapVao = input.nextLine();
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        char[] goc = a.toCharArray();
        char[] maHoa = b.toCharArray();
        char[] ketQua = new char[nhapVao.length()];
        for (int i=0;i<nhapVao.length();i++){
            for (int j=0;j<goc.length;j++){
                if (nhapVao.charAt(i) == (goc[j])){
                    ketQua[i] = maHoa[j];
                }
            }
        }
        System.out.println(ketQua);
        input.close();
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần mã hóa: ");
        String nhapVao = input.nextLine(); 
        input.close();

        final String PLAIN_TEXT = "abcdefghijklmnopqrstuvwxyz";
        final String CIPHER_TEXT = "zxcvbnmasdfghjklqwertyuiop";
        
        StringBuilder ketQua = new StringBuilder(); 

        for (int i = 0; i < nhapVao.length(); i++) {
            char kyTu = nhapVao.charAt(i);
            char kyTuThuong = Character.toLowerCase(kyTu);
            
            int viTri = PLAIN_TEXT.indexOf(kyTuThuong);

            if (viTri != -1) {
                char kyTuMaHoa = CIPHER_TEXT.charAt(viTri);
                
                if (Character.isUpperCase(kyTu)) {
                    ketQua.append(Character.toUpperCase(kyTuMaHoa));
                } else {
                    ketQua.append(kyTuMaHoa);
                }
            } else {
                ketQua.append(kyTu);
            }
        }

        System.out.println(ketQua.toString());
    }
}

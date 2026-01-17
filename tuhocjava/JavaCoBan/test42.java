
import java.util.Scanner;

public class test42 {
    static char showChar(String chuoi, int viTri){
        char dapAn = chuoi.charAt(viTri);
        return dapAn;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vui long nhap chuoi: ");
        String chuoi = input.nextLine();
        while (chuoi.length()<1){
            System.out.println("Vui long nhap chuoi khac chuoi rong: ");
            chuoi = input.nextLine();
        }
        System.out.print("Vui long nhap vi tri cua ki tu ban muon biet: ");
        int viTri = input.nextInt();
        while (viTri>chuoi.length() && viTri<0){
            System.out.println("Vi tri nay vuot qua do dai chuoi, vui long nhap lai: ");
            viTri = input.nextInt();
        }
        System.out.println("Ki tu tai vi tri " + viTri + " trong chuoi la: " + (showChar(chuoi, viTri)));
    }
}

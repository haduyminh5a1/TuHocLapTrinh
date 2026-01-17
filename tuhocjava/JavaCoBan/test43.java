
import java.util.Scanner;

public class test43 {
    static int[] nhapVao(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nhapVao[] = new int[n];
        for (int i=0;i<n;i++){
            nhapVao[i] = input.nextInt();
        }
        return nhapVao;
    }
    static int tong(int[] nhapVao){
        int tong=0;
        int congDon=0;
        for (int i=0;i<nhapVao.length;i++){
            congDon += nhapVao[i];
            tong += congDon;
        }
        return tong;
    }
    public static void main(String[] args) {
        int[] nhapVao = nhapVao();
        int tong = tong(nhapVao);
        System.out.println(tong);
    }
}

import java.util.*;
public class test36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chuoi = input.nextLine();
        int soLan = 0;
        char nhapVao = input.next().charAt(0);
        for (int i=0;i<chuoi.length();i++){
            if (nhapVao == (chuoi.charAt(i))){
                soLan++;
            }
        }
        System.out.println(soLan);
    }
}

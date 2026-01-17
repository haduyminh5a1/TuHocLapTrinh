import java.util.Scanner;
public class test46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nhapVao = input.nextLine();
        int so=0;
        int HOA=0;
        int thuong=0;
        int cach=0;
        for (int i=0;i<nhapVao.length();i++){
            char s = nhapVao.charAt(i);
            if (Character.isDigit(s))
                so++;
            else if (Character.isLowerCase(s))
                thuong++;
            else if (Character.isUpperCase(s))
                HOA++;
            else if (Character.isSpaceChar(s))
                cach++;
        }
        System.out.println(so);
        System.out.println(HOA);
        System.out.println(thuong);
        System.out.println(cach);
    }
}

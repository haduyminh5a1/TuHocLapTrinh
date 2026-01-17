
import java.util.Scanner;

public class test51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nhapVao = input.nextLine();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i=0;i<nhapVao.length();i++){
            char s = nhapVao.charAt(i);
            if (Character.isDigit(s)){
                a.append(s);
            }
            else if (Character.isLetter(s)){
                b.append(s);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}

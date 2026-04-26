package Baitaptrenlop;
import java.util.*;

public class SumofDigitsInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        int sum = 0;
        for (int i=0;i<n.length();i++){
            if (!Character.isDigit(n.charAt(i))){
                System.out.println("The input value is not an integer, program stopped");
                return;
            }
            sum += n.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

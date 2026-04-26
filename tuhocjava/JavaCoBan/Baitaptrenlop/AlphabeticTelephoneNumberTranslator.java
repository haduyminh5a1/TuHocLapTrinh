package Baitaptrenlop;
import java.util.*;

public class AlphabeticTelephoneNumberTranslator {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        String telephoneNumber = input.nextLine().toUpperCase();
        for (char c : telephoneNumber.toCharArray()){
            if (Character.isLetter(c)){
                if (c == 'A' || c == 'B' || c == 'C'){
                    sb.append("2");
                }
                else if (c == 'D' || c == 'E' || c == 'F'){
                    sb.append("3");
                }
                else if (c == 'G' || c == 'H' || c == 'I'){
                    sb.append("4");
                }
                else if (c == 'J' || c == 'K' || c == 'L'){
                    sb.append("5");
                }
                else if (c == 'M' || c == 'N' || c == 'O'){
                    sb.append("6");
                }
                else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S'){
                    sb.append("7");
                }
                else if (c == 'T' || c == 'U' || c == 'V'){
                    sb.append("8");
                }
                else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z'){
                    sb.append("9");
                }
            }
            else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}

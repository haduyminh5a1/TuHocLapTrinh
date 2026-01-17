
import java.util.Scanner;

public class test12 {
public static void main(String[] args) {
    String city;
    int StringLength;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your favourite city's name: ");
    city = input.nextLine();
    StringLength = city.length();
     String upper = city.toUpperCase();
     String lower = city.toLowerCase();
    char letter = city.charAt(0);
    System.out.println(city + "\n" + upper +"\n" + lower +"\n"+ letter);
}
}

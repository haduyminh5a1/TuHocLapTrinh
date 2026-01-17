
import java.util.Scanner;

public class test9 {
public static void main(String[] args) {
    Byte cookie;
    double calories;
    Scanner keyboard =  new Scanner(System.in);
    System.out.print("Enter the number of cookie you ate: ");
    cookie = keyboard.nextByte();
    calories = cookie*(300/10);
    System.out.println("The number of total calories you consumed is: " + calories);
}
}

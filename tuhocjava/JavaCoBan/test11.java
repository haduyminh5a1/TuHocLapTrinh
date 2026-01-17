
import java.util.Scanner;

public class test11 {
public static void main(String[] args) {
    double retailPrice;
    System.out.print("Enter the retail price of a circuit board: \n$");
    Scanner keyboard = new Scanner(System.in);
    retailPrice = keyboard.nextDouble();
    double profit = retailPrice*0.4;
    System.out.println("The amount of profit earned for that product is: $" + profit);
}
}

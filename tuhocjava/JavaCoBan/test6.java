
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        float sales;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The East Coast sales division of your company is: ");
        sales = keyboard.nextFloat();
        System.out.println("the East Coast division will generates $" + sales*0.62);
    }

}

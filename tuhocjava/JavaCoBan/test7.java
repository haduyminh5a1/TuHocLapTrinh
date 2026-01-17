
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        float landSize;
        float acre = 43560f;
        System.out.println("One acre of land is equivalent to 43,560 square feet\n" + "Enter your size of land:");
        Scanner keyboard = new Scanner(System.in);
        landSize = keyboard.nextFloat();
        System.out.println("the number of acres in your tract of land is: " + landSize/acre);
    }

}

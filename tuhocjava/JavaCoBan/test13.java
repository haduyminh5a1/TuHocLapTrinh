
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        double miles, gallons; double MPG;      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number of miles driven and the gallons of gas used respectively: ");
        miles = input.nextInt();
        gallons = input.nextInt();
        MPG = miles/gallons;
        System.out.println("Your car's MPG is " + MPG);
    }

}

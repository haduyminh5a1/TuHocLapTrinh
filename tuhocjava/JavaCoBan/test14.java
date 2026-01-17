
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        double mealCharge, taxAmount, tipAmount, totalBill;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter charge for the meal: ");
        mealCharge = input.nextDouble();
        taxAmount = mealCharge*0.0675;
        tipAmount = (taxAmount+mealCharge)*0.2;
        totalBill = mealCharge+taxAmount+tipAmount;
        System.out.println("The meal charge is : $" + mealCharge + "\nThe tax amount is $" + taxAmount + "\nThe tip amount is $" + tipAmount +"\nSo the total bill is: $" + totalBill);
}
}

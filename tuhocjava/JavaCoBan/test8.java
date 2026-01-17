
import java.util.Scanner;

public class test8 {
public static void main(String[] args) {
    float purchase;
    float stateTax, countyTax, totalTax, totalSale ;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your amount of purchase:");
    purchase = keyboard.nextFloat();
    stateTax = (purchase*0.02f); countyTax = purchase*0.04f; totalTax = countyTax + stateTax; totalSale = totalTax + purchase;
    System.out.println("Your amount of purchase is $" + purchase +"\nSo the state tax is $" + stateTax + " and the county tax is $" + countyTax + "\nYour total sales task is $" + totalTax +" and your total of sale is $" + totalSale);
}
}

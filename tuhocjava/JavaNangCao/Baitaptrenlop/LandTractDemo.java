package JavaNangCao.Baitaptrenlop;

import java.util.Scanner;

public class LandTractDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter dimensions for Land Tract #1:");
        System.out.print("Length: ");
        double length1 = keyboard.nextDouble();
        System.out.print("Width: ");
        double width1 = keyboard.nextDouble();
        LandTract tract1 = new LandTract(length1, width1);

        System.out.println("\nEnter dimensions for Land Tract #2:");
        System.out.print("Length: ");
        double length2 = keyboard.nextDouble();
        System.out.print("Width: ");
        double width2 = keyboard.nextDouble();
        LandTract tract2 = new LandTract(length2, width2);

        System.out.println("\n--- Results ---");
        System.out.println("Tract 1: " + tract1);
        System.out.println("Tract 2: " + tract2);

        if (tract1.equals(tract2)) {
            System.out.println("\nConclusion: The two tracts are of EQUAL size.");
        } else {
            System.out.println("\nConclusion: The two tracts are NOT of equal size.");
        }

        keyboard.close();
    }
}

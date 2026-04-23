package Projects.ClassAndObjectLab.TelevisionLab;

import java.util.Scanner;

/**
 * This class demonstrates the functionalities of the Television class.
 */
public class TelevisionDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        String brand;
        int size;

        // Prompt the user for television brand and size
        System.out.print("Enter the brand of the television: ");
        brand = keyboard.nextLine();
        System.out.print("Enter the size of the television (in inches): ");
        size = keyboard.nextInt();

        // Instantiate the Television object
        Television tv = new Television(brand, size);

        // Demonstrate the power button
        System.out.println("\nTurning the TV on...");
        tv.power();

        // Demonstrate volume control
        System.out.println("Increasing volume...");
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        
        // Demonstrate channel selection
        System.out.print("Enter a channel to tune to: ");
        int station = keyboard.nextInt();
        tv.setChannel(station);

        // Display the current state of the television
        System.out.println("\n--- Current TV Status ---");
        System.out.println("Manufacturer: " + tv.getManufacturer());
        System.out.println("Screen Size: " + tv.getScreenSize() + " inches");
        System.out.println("Channel: " + tv.getChannel());
        System.out.println("Volume: " + tv.getVolume());

        // Demonstrate turning the TV off
        System.out.println("\nTurning the TV off...");
        tv.power();
    }
}

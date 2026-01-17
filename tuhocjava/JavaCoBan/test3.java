import java.util.Scanner;
public class test3 
{
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first name, middle name and last name respectively: ");
        firstName = keyboard.nextLine();
        middleName = keyboard.nextLine();
        lastName = keyboard.nextLine();
        System.out.println(firstName + " " + middleName + " " + lastName);
        /*The code under still run:
        System.out.println("Please enter your first name: ");
        firstName = keyboard.nextLine( );
        System.out.println("Please enter your middle name: ");
        middleName = keyboard.nextLine( );
        System.out.println("Please enter your last name: ");
        lastName = keyboard.nextLine( );
        System.out.println(firstName + " " + middleName + " " + lastName);
        */
    }

}

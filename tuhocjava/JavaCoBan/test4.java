import java.util.Scanner;
public class test4 
{
    public static void main(String[] args) 
    {
        String name, address, city, country, collegeMajor, phoneNumber, ZIP;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your information: ");
        name = keyboard.nextLine();
        address = keyboard.nextLine();
        city = keyboard.nextLine();
        country = keyboard.nextLine();
        phoneNumber = keyboard.nextLine();
        collegeMajor = keyboard.nextLine();
        ZIP = keyboard.nextLine();
        System.out.println(name + "\n" + address + "," + city + "," + country + "," + ZIP + "\n" + phoneNumber + "\n" + collegeMajor);
    }

}

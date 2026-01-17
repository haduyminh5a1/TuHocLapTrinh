import java.util.Scanner;
public class test10 {
public static void main(String[] args) {
    int a, b, c;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter three number a, b, c respectively: ");
    a = keyboard.nextInt();
    b = keyboard.nextInt();
    c = keyboard.nextInt();
    int average = (a+b+c)/3;
    System.out.println("The numbers you entered are: " + a + "," + b + "," + c + "\nThe average of them is: " + average);
}
}

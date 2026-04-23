package JavaNangCao.JavaAdvancedLearn.FileHandling;
import java.util.*;
import java.io.*;

public class FileLearn1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = 0;
        while (!input.hasNextInt()){
            System.out.println("Age should be a number, please enter your age again: ");
            input.next();
        }

        age = input.nextInt();

        System.out.println("Hello " + name + "! Welcome to Java at " + age + " years old");

        input.close();
    }
}

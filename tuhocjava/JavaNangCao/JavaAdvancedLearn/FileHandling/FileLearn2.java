package JavaNangCao.JavaAdvancedLearn.FileHandling;
import java.util.*;
import java.io.*;

public class FileLearn2 {
    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        File myFile = new File("data.txt");

        try (Scanner fileScanner = new Scanner(myFile)) {
            System.out.println("What is in the file: ");
            while (fileScanner.hasNext()){
                String name = fileScanner.next();

                if (fileScanner.hasNextInt()){
                    int age = fileScanner.nextInt();
                    System.out.println("Name: " + name + ", age: " + age);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}

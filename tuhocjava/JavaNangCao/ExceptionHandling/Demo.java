package JavaNangCao.ExceptionHandling;

import java.util.*;
import java.io.*;
public class Demo {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) {
        ArrayList<Students> stdList = new ArrayList<>();

        try {
            System.out.println("Please enter how many students you want to add to list");

            int n = Integer.parseInt(reader.readLine());
            int i = 1;
            while (i <= n) {
                Students sv = new Students();
                System.out.println("---Student Information---");

                System.out.println("Enter student id:");
                sv.setId(reader.readLine());

                System.out.println("Enter student name:");
                sv.setName(reader.readLine());

                System.out.println("Enter student score:");
                sv.setScore(scoreInput());

                System.out.println("Enter student age: ");
                sv.setAge(ageInput());

                stdList.add(sv);

                i++;
            }
                System.out.println("---Students List---");
                for (Students sv : stdList){
                    System.out.println(sv.toString());
                }
            } catch (IOException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
    }
    
    public static double scoreInput(){
        while (true) {
            try {
                System.out.println("Score must be 0.00 - 10.00");
                double d = Double.parseDouble(reader.readLine());
                if (d >= 0 && d <= 10){
                    return d;
                }
                System.out.println("The score is invalid");
            } catch (Exception ex) {
                System.out.println("Invalid input!!");
                ex.getStackTrace();
            }
        }
    }

    public static int ageInput(){
        while (true){   
            try {
                System.out.println("Input age");
                int a = Integer.parseInt(reader.readLine());
                if (a >= 18 && a <= 100) return a;
                System.out.println("Invalid age!!");
            } catch (Exception ex) {
                System.out.println("Invalid input!!");
                ex.getStackTrace();
            }
        }
    }
}

package JavaNangCao.ExceptionHandling;

import java.util.*;

public class Vidu4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        try {
            System.out.println("try");
        } catch (Exception ex) {
            System.out.println("catch ex");
        } finally {
            System.out.println("finally");
            input.close();
        }
        
        //
        try (Scanner sc = new Scanner(System.in)){
            int y = sc.nextInt();
        }
    }
}

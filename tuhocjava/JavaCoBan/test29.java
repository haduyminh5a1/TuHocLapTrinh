import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test29 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String traLoi;
        int a = input.nextInt();
        if (isPrime(a)==true)
        System.out.println("YES");   
        else if (isPrime(a)==false)
        System.out.println("FALSE");         
    }
    static boolean isPrime(int a) {
        if (a == 2 || a == 3) return true;
        if (a <= 1 || a % 2 ==0 || a % 3 == 0) return false;
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i+2) == 0) return false;
        }
        return true;
}
}

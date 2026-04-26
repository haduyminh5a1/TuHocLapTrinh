package Baitaptrenlop.PasswordVerifier;
import java.util.*;

public class PasswordVerifierDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        PasswordVerifier pv = new PasswordVerifier(password);
        if (!pv.verifier()){
            System.out.println("Password need at least 6 characters length, one uppercase, one lowercase and one digit");
        }
        else {
            System.out.println("Valid password");
        }
    }
}

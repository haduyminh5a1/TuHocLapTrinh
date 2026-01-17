import java.util.*;
public class NonTrivialRotation {
    public static boolean isNonTrivialRotation(String s1, String s2) {
        // Write your code here
        if (s1.length()!=s2.length())
            return false;
        if (s1.equals(s2))
            return false;
        String doubled = s1 + s1;
        if(doubled.contains(s2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if (isNonTrivialRotation(s1,s2))
            System.out.println("1");
        else
            System.out.println("0");
    }
}

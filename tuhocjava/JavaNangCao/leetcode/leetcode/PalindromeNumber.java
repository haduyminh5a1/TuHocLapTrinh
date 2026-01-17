package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x<0 || x%10 == 0) {
            return false;
        } else {
            StringBuilder s = new StringBuilder();
            s.append(x);
            if (s.toString().equals(s.reverse().toString()) ){
                return true;
            }
            else return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPalindrome(x));
    }
}

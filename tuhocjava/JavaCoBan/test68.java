import java.util.Scanner;

public class test68 {
    public static boolean isAlphabeticPalindrome(String code) {
        // Write your code here
        StringBuilder string = new StringBuilder();
        for (char c : code.toCharArray()){
            if (Character.isLetter(c))
                string.append(Character.toLowerCase(c));
            }

        return ((string.toString()).equals(string.reverse().toString()));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.nextLine().toLowerCase();
        System.out.println(isAlphabeticPalindrome(code) ? 1 : 0);
    }
}

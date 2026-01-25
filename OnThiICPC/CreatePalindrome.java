
import java.util.*;

public class CreatePalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.length() <= 0 || s == null){
            System.out.println("NO SOLUTION");
            return;
        }
        int[] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch - 'A']++;
        }
        int oddCount = 0;
        int oddIndex = -1;
        for (int i=0;i<26;i++){
            if (freq[i] % 2 != 0){
                oddCount++;
                oddIndex = i;
            }
        }
        if (oddCount >= 2){
            System.out.println("NO SOLUTION");
            return;
        }
        
        StringBuilder firstHalf = new StringBuilder();
        for (int i=0; i<26; i++){
            for (int j=0;j<freq[i]/2;j++){
                firstHalf.append((char) (i + 'A'));
            }
        }
        String middle = (oddIndex == -1) ? "" : "" + (char) (oddIndex + 'A');
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        String palindrome = firstHalf.toString() + middle + secondHalf;
        System.out.println(palindrome);
    }
}

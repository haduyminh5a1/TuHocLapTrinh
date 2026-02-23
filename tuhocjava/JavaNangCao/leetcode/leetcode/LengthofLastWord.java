package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class LengthofLastWord {
    public static int lengthOfTheLastWord(String s){
        // String[] check = s.trim().split("\\s");
        // return check[check.length-1].length();
        int count = 0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) != ' '){
                count++;
            }
            else if (s.charAt(i) == ' ' && count > 0) {
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}

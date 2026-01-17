package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs[0].isEmpty()) return "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length ; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
        /*
        if (strs == null || strs.length == 0) return "";
    
        // Start by assuming the first string is the common prefix
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // While the current string (strs[i]) does not start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If it becomes empty, there is no common prefix at all
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
        */
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strs = input.nextLine().trim().toLowerCase().split("\\s+");
        System.out.println(longestCommonPrefix(strs));
    }
}

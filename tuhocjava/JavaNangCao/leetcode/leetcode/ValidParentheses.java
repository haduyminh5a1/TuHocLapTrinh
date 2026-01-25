package JavaNangCao.leetcode.leetcode;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s){
        if (s.length() == 0 || s.isEmpty()) return true;
        int l = s.length();
        Set<Character> check = new HashSet<>();
        for (int i=0;i<s.length()-1;i++){
            check.add(s.charAt(i));
            for (int j=i;j<s.length();j++){
                if (check.contains(s.charAt(j))){
                    check.remove(check);
                    l--;
                }
            }
        }
        if (l == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isValid(s));
    }
}

package JavaNangCao.leetcode.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        if (s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        if (sb.toString().equals(sb.reverse().toString())) return true;
        return false;
    }

    public static boolean isPalindromeTwoPointers(String s){
        if (s == null || s.isEmpty()) return true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char leftChar = s.charAt(left), rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else { 
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;
    }
}

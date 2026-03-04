package JavaNangCao.DSAPractice.leetcode.leetcode;

public class StringToInteger {
    public int myAtoi(String s){
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        long result = 0;
        int i=0;
        int sign = 1;

        if (s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i++) - '0');

            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) result*sign;
    }
}

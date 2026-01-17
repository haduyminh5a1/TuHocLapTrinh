package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class RomantoInteger {
    public static int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
        // for(int i = 0; i < s.length(); i++){
        //     if(i+1 != s.length() && (romanToNumber.get(s.charAt(i)) < romanToNumber.get(s.charAt(i+1)))){
        //         result += (romanToNumber.get(s.charAt(i+1)) - romanToNumber.get(s.charAt(i)));
        //         i++;
        //     }else{
        //         result += romanToNumber.get(s.charAt(i));
        //     }
        // }
        // return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(romanToInt(s));
    }
}

package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        // if (s.length() != t.length()) return false;
        // int[] count = new int[26];
        // for (int i=0;i<s.length();i++){
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }

        // for (int i : count){
        //     if (i != 0) return false;
        // }
        // return true;

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            int count = 1;
            if (map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else {
                map.put(c, count);
            }
        }

        for (char c : t.toCharArray()){
            if (!map.containsKey(c)) return false;
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) return false;
        }
        return true;
    }
}

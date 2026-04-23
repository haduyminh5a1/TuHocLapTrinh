package JavaNangCao.DSAPractice.leetcode.leetcode;
import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s){
        String[] tokens = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;
        for (char c : pattern.toCharArray()){
            if (map.containsKey(c)){
                if (!map.get(c).equals(tokens[i])) return false;
            }
            else {
                if (map.containsValue(tokens[i])) return false;
                map.put(c, tokens[i]);
            }
            i++;
        }
        return true;
    }
}

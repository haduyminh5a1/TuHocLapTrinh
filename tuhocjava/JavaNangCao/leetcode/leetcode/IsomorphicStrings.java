package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map.containsKey(cs)){
                if (map.get(cs) != ct) return false;
            }
            else {
                if (map.containsValue(ct)) return false;
                map.put(cs, ct);
            }
        }
        return true;
    /*  for (int i = 0; i < n1; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Kiểm tra ánh xạ từ S sang T
            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) return false;
            } else {
                mapST.put(charS, charT);
            }

            // Kiểm tra ánh xạ ngược từ T sang S
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) return false;
            } else {
                mapTS.put(charT, charS);
            }
        } */
    }
}

package JavaNangCao.DSAPractice.leetcode.leetcode;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        if (ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : magazine.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()){
            int count = map1.getOrDefault(c, 0);
            if (count == 0) return false;
            map1.put(c, count - 1);
        }
        return true;
    }
}

package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ResultValidAnagram{
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        for (char char_s : string1){
            for (char char_t : string2){
                if (char_s!=char_t) return false;
            }
        }
        return true;
    }
}
public class ValidAnagram {
    public static void main(String[] args) throws IOException {
        String s = "";
        String t = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            s = bufferedReader.readLine();
            t = bufferedReader.readLine();
            }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        boolean result = ResultValidAnagram.isAnagram(s,t);
        System.out.println(result);
    }
}

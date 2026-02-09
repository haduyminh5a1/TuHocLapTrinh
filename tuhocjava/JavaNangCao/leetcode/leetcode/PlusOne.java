package JavaNangCao.leetcode.leetcode;
import java.io.*;
import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i=n-1;i>=0;i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }    

        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split("\\s+");

        int[] digits = new int[line.length()];
        for (int i=0;i<line.length();i++){
            digits[i] = Integer.parseInt(parts[i]);
        }

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result));

        reader.close();
    }
}

package JavaNangCao.leetcode.leetcode;
import java.math.*;
import java.util.*;

public class AddBinary {
    public static String addBinary(String a, String b){
        // BigInteger n = new BigInteger(a, 2);
        // BigInteger m = new BigInteger(b, 2);

        // BigInteger result = n.add(m);
        // return result.toString(2);
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum%2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }
}

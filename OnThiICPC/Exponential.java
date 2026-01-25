import java.util.*;
public class Exponential {
    public static final long MOD = (long) Math.pow(10, 9) + 7;
    public static long expCal(long a, long b){
        long result = 1;
        a = a % MOD;
        while (b > 0){
            if (b % 2 != 0){
                result = (result*a) % MOD;
            }
            a = (a*a) % MOD;
            b = b/2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[][] arr = new long[n][2];
        for (int i=0;i<n;i++){
            long a = input.nextInt();
            long b = input.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            if (a == 0 && b == 0){
                System.out.println(1);
            }
            else {
                System.out.println(expCal(a, b));
            }
        }
    }
}


import java.util.*;

public class Fibonacci {
    public static final long MOD = 1000000007L;
    public static long[][] matrixMultiply(long[][] A, long[][] B){
        long[][] C = new long[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                C[i][j] = 0;
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                for (int k=0;k<2;k++){
                    C[i][j] = (C[i][j] + A[i][k] * B[i][k]) % MOD;
                }
            }
        }
        return C;
    }
    public static 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

    }
}

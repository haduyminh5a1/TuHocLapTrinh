
import java.math.BigInteger;
import java.util.Scanner;
public class test30 {
    
    static BigInteger comb(int N, int r) {
        if (r < 0 || r > N) return BigInteger.ZERO;
        if (r == 0 || r == N) return BigInteger.ONE;
        r = Math.min(r, N - r);
        BigInteger tu = BigInteger.ONE;
        BigInteger mau = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            tu = tu.multiply(BigInteger.valueOf(N - r + i));
            mau = mau.multiply(BigInteger.valueOf(i));
        }
        return tu.divide(mau);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        // ✅ Nếu k = 0 → kết quả là 0 theo yêu cầu
        if (k == 0) {
            System.out.println(0);
            return;
        }

        BigInteger ans = BigInteger.ZERO;

        // Duyệt qua số bò đực m
        for (int m = 0; m <= n; m++) {
            long boCaican = (long)(m - 1) * k; // số bò cái cần giữa các bò đực
            long boCainow = (long)n - m; // số bò cái hiện có
            if (boCainow < boCaican) break; // nếu không đủ bò cái → dừng

            int N = (int)(n - (m - 1) * k);  // N = r + m = n - (m-1)*k : tổng vị trí hợp lệ cho m bò đực
            if (N < m) continue;
            ans = ans.add(comb(N, m));
        }

        System.out.println(ans);
}
}

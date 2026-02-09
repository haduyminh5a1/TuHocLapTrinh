import java.math.BigInteger;
import java.util.*;

public class CowArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // tổng số bò
        int k = sc.nextInt();  // số bò cái cần có giữa 2 bò đực
        sc.close();

        // dp[i][j] = số cách sắp xếp i con bò có j con bò đực hợp lệ
        BigInteger[][] dp = new BigInteger[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(dp[i], BigInteger.ZERO);

        dp[0][0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                // TH1: thêm 1 bò cái vào
                dp[i][j] = dp[i][j].add(dp[i - 1][j]);

                // TH2: thêm 1 bò đực, phải có khoảng cách >= k
                if (j > 0 && i - k - 1 >= 0) {
                    dp[i][j] = dp[i][j].add(dp[i - k - 1][j - 1]);
                }
            }
        }

        // Tổng số cách sắp xếp hợp lệ là tổng của tất cả số cách có j bò đực
        BigInteger ans = BigInteger.ZERO;
        for (int j = 0; j <= n; j++)
            ans = ans.add(dp[n][j]);

        // Nếu k = 0 thì kết quả là 0 (theo yêu cầu đề)
        if (k == 0) ans = BigInteger.ZERO;

        System.out.println(ans);
        /*  static BigInteger comb(int N, int r) {
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

            // Nếu k = 0 → kết quả là 0 theo yêu cầu
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
         */
    }
}


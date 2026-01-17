import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class test32 {
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
}
}

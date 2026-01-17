import java.util.*;
public class ChiaTienDiChoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] coins = new int[N];
        int total = 0;

        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
            total += coins[i];
        }

        boolean[] dp = new boolean[total + 1];
        dp[0] = true;

        for (int coin : coins) {
            for (int j = total; j >= coin; j--) {
                dp[j] = dp[j] || dp[j - coin];
            }
        }

        int bobTotal = 0;
        for (int i = total / 2; i >= 0; i--) {
            if (dp[i]) {
                bobTotal = i;
                break;
            }
        }

        int aliceTotal = total - bobTotal;
        System.out.println(aliceTotal);

        scanner.close();
    }
}

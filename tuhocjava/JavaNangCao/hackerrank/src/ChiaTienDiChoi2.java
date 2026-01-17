import java.util.Scanner;

public class ChiaTienDiChoi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total = 0;
        int BobTotal = 0;
        int[] coins = new int[n];
        for (int i=0;i<n;i++){
            coins[i] = input.nextInt();
            total += coins[i];
        }

        boolean[] possibleSum = new boolean[total+1];
        possibleSum[0] = true;

        for (int coin : coins){
            for (int i=total;i>=coin;i--){
                possibleSum[i] = possibleSum[i] || possibleSum[i-coin];
            }
        }
        for (int i=total/2;i>=0;i--){
            if (possibleSum[i]){
                BobTotal = i;
                break;
            }
        }
        int AliceTotal = total-BobTotal;
        System.out.println(AliceTotal);
    }
}

package JavaNangCao.leetcode.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n){
        if (n <= 1) return n;

        int a = 1;
        int b = 1;

        for (int i=2;i<=n;i++){
            int tong = a+b;
            a = b;
            b = tong;
        }

        return b;
    }
}

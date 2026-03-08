package JavaNangCao.DSAPractice.leetcode.leetcode;

public class PowerOfFour {
    public boolean isPowerOfFour(int n){
        if (n <= 0) return false;
        while (n > 1){
            if (n % 4 != 0) return false; //Có thể dùng (n & 3) != 0
            n >>= 2;
        }
        return n == 1;
    }
}

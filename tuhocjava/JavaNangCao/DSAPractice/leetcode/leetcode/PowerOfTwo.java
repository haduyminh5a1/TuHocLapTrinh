package JavaNangCao.DSAPractice.leetcode.leetcode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if (n <= 0) return false;
        while (n > 1){
            if ((n&1) != 0) return false;
            n >>= 1;
        }
        return n == 1;
    }
}

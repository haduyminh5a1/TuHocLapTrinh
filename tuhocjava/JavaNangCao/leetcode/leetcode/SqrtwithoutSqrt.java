package JavaNangCao.leetcode.leetcode;

public class SqrtwithoutSqrt {
    public static int mySqrt(int x){
        if (x == 0) return 0;
        
        long g = x;

        while (g * g > x){
            g = (x/g + g) / 2;
        }
        return (int) g;
    }
}

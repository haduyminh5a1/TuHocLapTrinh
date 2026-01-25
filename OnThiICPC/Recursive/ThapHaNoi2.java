

import java.util.*;

public class ThapHaNoi2 {
    public static int thapHaNoi(int m, int n){
        if (m - 2 == 1){
            return (int) Math.pow(2, n) - 1;
        }
        thapHaNoi(m-1, n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

    }
}

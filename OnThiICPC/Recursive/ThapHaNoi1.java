
import java.util.*;

public class ThapHaNoi1 {
    public static void thapHaNoi(int n, int from, int aux, int to){
        if (n <= 1){
            System.out.println(from + " " + to);
            return;
        }
        thapHaNoi(n-1, from, to, aux);
        System.out.println(from + " " + to);
        thapHaNoi(n-1, aux, from, to);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = (int) Math.pow(2, n) - 1;
        System.out.println(count);
        thapHaNoi(n, 1, 2, 3);
    }
}

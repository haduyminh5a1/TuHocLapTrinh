import java.util.*;

public class testnew1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n & (n-1));
        while (n >= 1){
            if (n % 2 == 0){
                n >>= 1;
                sb.append(0);
            }
            else {
                n >>= 1;
                sb.append(1);
            }
        }
        System.out.println(sb.reverse().toString());

        
    }
}

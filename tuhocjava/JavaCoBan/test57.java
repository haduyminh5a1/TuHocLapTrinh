
import java.util.*;

public class test57 {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            list.add(number.nextInt(1,101));
        }
        System.out.println(list);
    }
}

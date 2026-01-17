import java.util.*;
public class test58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n = input.nextInt();
        int dem = 0;
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            int t = Math.powExact(random.nextInt(1, 101), 2);
            list.add(t);
            if (t>50){
                dem++;
            }
        }
        System.out.println(list);
        System.out.println(dem);
    }
}

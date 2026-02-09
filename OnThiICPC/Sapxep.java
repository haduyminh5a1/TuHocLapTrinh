import java.util.*;

public class Sapxep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (!input.hasNext()) return;
        int k = input.nextInt();
        Set<String> result = new HashSet<>();
        for (int i=0;i<k;i++){
            if (input.hasNextInt()) {
                int n = input.nextInt();

                for (int j=0;j<n;j++){
                    if (input.hasNext()) {
                        result.add(input.next());
                    }
                }
            }
        }
        System.out.println(result.size());
    }
}

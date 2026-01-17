import java.util.*;
public class FindSmallestMissingNumber {
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        // Write your code here
        int n = orderNumbers.size();
        for (int i = 0; i < n; i++) {
            while (true){
                int value = orderNumbers.get(i);
                if (value<=0 || value>n) break;
                if (orderNumbers.get(value-1)==value) break;
                Collections.swap(orderNumbers, i, value-1);
            }
        }
        for (int i=0;i<n;i++){
            if (orderNumbers.get(i)!=i+1) return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> orderNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = input.nextInt();
            orderNumbers.add(value);
        }
        System.out.println(findSmallestMissingPositive(orderNumbers));
    }
}

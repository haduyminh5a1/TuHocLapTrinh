import java.util.*;
public class test69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i=0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        int[] clone = numbers.clone();
        System.out.println(Arrays.toString(clone));
    }
}

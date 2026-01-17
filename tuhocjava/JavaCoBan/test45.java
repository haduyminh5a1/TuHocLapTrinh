
import java.util.Scanner;

public class test45 {
    static int totalCost(int i, int j, int k){
        int total = i*k/115*(j+8*18);
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rooms = input.nextInt();
        int paintPrice = input.nextInt();
        int wallSpace = input.nextInt();
        int total = totalCost(rooms, paintPrice, wallSpace);
        System.out.println(total);
    }
}

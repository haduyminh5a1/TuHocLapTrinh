import java.util.*;

public class Vidu {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
        } catch (Exception e){
            System.out.println("Invalid input");
        } finally {
            System.out.println("Ended");
        }
    }
}

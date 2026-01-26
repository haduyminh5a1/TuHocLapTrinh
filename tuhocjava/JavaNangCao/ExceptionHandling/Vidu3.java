import java.util.*;

public class Vidu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            try {
                int x = input.nextInt();
                try {
                    System.out.println(10/x);
                    break;
                } catch (Exception ex) {
                    System.out.println("Run error with x = " + x);
                }
            } catch (Exception ex){
                input.next();
                System.out.println("Run error");
            }
        }
    }
}

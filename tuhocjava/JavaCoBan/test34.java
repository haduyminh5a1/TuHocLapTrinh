import java.util.*;
public class test34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hang = input.nextInt();
        for (int i=hang;i>0;i--){
            for (int j=0;j<hang-i;j++){
                if (i==0|| j==0 || j==hang-i-1 || i==hang)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i=0;i<hang-2;i++){
            for (int j=0;j<hang-1;j++){
                if (j==i+1 || j==hang-2)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

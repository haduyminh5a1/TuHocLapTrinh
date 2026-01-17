public class vehinh {
    public static void main(String[] args) {
        int hang = 4; // 4 hàng

        for (int i = 1; i <= hang; i++) {
            
            // 1. In khoảng trắng căn lề (rows - i)
            for (int j = 1; j <= hang - i; j++) {
                System.out.print("  ");
            }

            // 2. In dấu sao (2 * i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* "); // In đặc
            }

            System.out.println();
        }
        System.out.println("\n");
        int rows = 4; // The triangle has 4 rows

        // Outer loop for rows (i = 1, 2, 3, 4)
        for (int i = 1; i <= rows; i++) {

            // 1. Inner loop for printing leading spaces (for centering)
            // Number of spaces = rows - i
            int spacesToPrint = rows - i; 
            for (int j = 1; j <= spacesToPrint; j++) {
                System.out.print("  ");
            }

            // 2. Inner loop for printing the dots/stars
            // Number of stars = (2 * i - 1) -> (1, 3, 5, 7)
            int starsToPrint = 2 * i - 1;
            for (int k = 1; k <= starsToPrint; k++) {
                // Using '*' instead of '.' for clarity on most consoles
                System.out.print("* ");
            }

            // 3. Print a newline to move to the next row
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang;j++){
                if (i==j || j==1 || i==hang){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang;j++){
                if (i==1 || j==1 || i==hang || j==hang){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=hang;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=hang;j>=i;j--){
                if (i==j || i==1 || j==hang)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang;j++){
                if (j==hang || i==1 || i==j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++){
                if (k==1 || i==hang || k==2*i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=1;i<=hang;i++){
            for (int j=1;j<=hang-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=0;i<hang;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<hang;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("  ");
            }
            for (int k=0;k<hang-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i=0;i<hang;i++){
            for (int j=0;j<i;j++){
                if (j==0)
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

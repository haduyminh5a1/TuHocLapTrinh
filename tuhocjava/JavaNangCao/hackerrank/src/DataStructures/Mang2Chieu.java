package DataStructures;

import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
/*        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + j) % 2 == 0 ? 1 : 0;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }*/
        /*arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m-1; j++) {
                arr[i][j+1] = arr[i][j] + 1;
            }
            if (i==n-1) break;
            arr[i+1][0] = arr[i][m-1]+1;

        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }*/


    }
}

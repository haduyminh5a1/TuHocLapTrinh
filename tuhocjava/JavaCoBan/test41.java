import java.util.*;

public class test41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M[] = new int[N];
        for (int i=0;i<N;i++){
            M[i] = input.nextInt();
        }
        input.close();
        for (int i=0;i<N-1;i++){
            for (int j=0;j<N-i-1;j++){
                if (M[j]>M[j+1]){
                    int temp = M[j+1];
                    M[j+1] = M[j];
                    M[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(M));
}
}

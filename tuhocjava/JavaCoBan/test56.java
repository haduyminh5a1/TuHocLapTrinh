import java.util.*;

public class test56 {
    static int isEven(){
        Random random = new Random();
        int demChan = 0;
        int number;
        for (int i=0;i<100;i++){
            number = random.nextInt();
            if (number%2 == 0){
                demChan++;
            }
        }
        System.out.println("");
        return demChan;
    }
    public static void main(String[] args) {
        int soLe = 100-isEven();
        int soChan = isEven();
        System.out.println("So so chan la: " + soChan + "\nSo so le la: " + soLe);
    }
}

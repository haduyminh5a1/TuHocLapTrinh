public class test23 {
    public static void main(String[] args) {
        int tong=0;
        double giaiThua=1;
        for (double i=1;i<=10;i++){
            giaiThua*=i;
            tong+=giaiThua;
        }
        System.out.println(tong);
    }
}

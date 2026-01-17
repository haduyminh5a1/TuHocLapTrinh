public class test55 {
    static double fallingDistance(int t){
        final  double g = 9.8;
        double d = 0.5*g*Math.pow(t, 2);
        return d;
    }
    public static void main(String[] args) {
        double d = 0;
        for (int i=1;i<=10;i++){
            d = fallingDistance(i);
        }
        System.out.printf("%.2f", d);
    }
}

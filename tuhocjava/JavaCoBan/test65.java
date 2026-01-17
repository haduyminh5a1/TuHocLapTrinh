public class test65 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            System.out.println("Day la bang cuu chuong " + i);
            for (int j=1;j<=9;j++){
                System.out.println(i + " * " + j + " = " + (i*j));
                if (j==9){
                    System.out.println("----------------------------");
                }
            }
        }
    }
}

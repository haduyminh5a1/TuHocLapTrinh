package JavaNangCao.ExceptionHandling;

public class Vidu2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
        System.out.println(c);
        } catch (ArithmeticException ex) {
            System.out.println("Loi toan hoc");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Chuong trinh da dung");
            ex.printStackTrace();
        } finally {
            System.out.println("Luon lam cai nay du co loi hay khong");
        }
        System.out.println("Doan code phia sau");
    }
}

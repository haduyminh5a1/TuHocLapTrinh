package BaiTap.BaiTrenLop;

public class Demo {
    public static void main(String[] args) {
        ProductionWorker e1 = new ProductionWorker("Nguyen Van A", "3636-B", "18/6/2025", ProductionWorker.DAY_SHIFT, 30.00);

        System.out.println(e1.getEnumber());
        System.out.println(e1.getename());
        System.out.println(e1.getHireDate());
        System.out.println(e1.getPayRate());
        System.out.println(e1.getShift());
    }
}

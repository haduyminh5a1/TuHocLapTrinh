package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Minh","2122","Ha Noi");
        System.out.println(ns1.tinhLuong(21));
        System.out.println(ns1.getTen() + " " + ns1.getCccd() + " " + ns1.getQue());
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(),  ns1.getQue());
        System.out.println(ns1.getTen() + " " + ns1.getCccd() + " " + ns1.getQue());
        System.out.println(ns1.tinhLuong(21));
    }
}

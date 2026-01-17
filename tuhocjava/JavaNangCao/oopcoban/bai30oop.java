import TruongDaiHoc.SinhVien;

public class bai30oop {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        SinhVien sv2 = new SinhVien("Duy Minh");
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Duy Minh", 9.5);
        sv3.hienThiThongTin();
        //
        //
        System.out.println(sv3.getHoTen());
        System.out.println(sv3.getDiem());
        sv3.setHoTen("Hoang");
        sv3.setDiem(25);
        sv3.hienThiThongTin();
        sv3.setHoTen("Nam");
        sv3.setDiem(10);
        sv3.hienThiThongTin();
        double diemsv3 = sv3.tinhDTB(7.5,7.2);
        System.out.println(diemsv3);
        System.out.println(sv3);
        sv3.checkDiemHopLe();
        double testDiem = sv3.tinhDTB(5,6,7);
        System.out.println(testDiem);
        double testDiem2 = sv3.tinhDTB(9, 7);
        System.out.println(testDiem2);
        double kq = sv3.tongDiem(1,3,5,3,10,8,9);
        System.out.println(kq);
        System.out.println(sv1);
    }
}

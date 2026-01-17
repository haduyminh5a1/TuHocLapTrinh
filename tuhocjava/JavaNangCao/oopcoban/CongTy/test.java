package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("nhan vien 1", "Bac Ninh", 123456);
        double luong = nv1.tinhLuong();
        System.out.println(luong);*/
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hanh chinh 1", "Thai Nguyen", 33333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("lương nhân viên hành chính 1 là: " + luonghc1);
        NhanVienDiCa diCa1 = new NhanVienDiCa("Di ca 1", "Ha Noi", 5050994);
        double ca1luong = diCa1.tinhLuong();
        System.out.println(ca1luong);
        NhanVienDiCa diCa2 =  new NhanVienDiCa("Tu", "Tu Son", 5423121, 1);
        double luongCa2 = diCa1.tinhLuong();
        System.out.println(luongCa2);
        System.out.println(diCa2.ca);
    }
}

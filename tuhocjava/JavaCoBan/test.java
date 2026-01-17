public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(8.5,"Nguyen Van A","43899293" );
        System.out.println("Thong tin cua sinh vien 1 la: "+sv1.thongTinSinhVien());
        SinhVien sv2 = new SinhVien(10,"Nguyen Van B","8321033" );
        System.out.println("Thong tin cua sinh vien 2 la: "+sv2.thongTinSinhVien());
    }
}

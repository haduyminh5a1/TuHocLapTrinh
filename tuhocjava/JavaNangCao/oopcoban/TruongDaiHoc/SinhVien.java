package TruongDaiHoc;
public class SinhVien {
    protected  String hoTen;
    private double diem;
    //thuộc tính
    public void hienThiThongTin(){
        System.out.println(hoTen + " : " + diem);
    }
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }
    //phương thức 2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh){
        return (diemToan+diemVan+diemAnh)/3;
    }
    //phương thức 3
    public double tinhDTB(double diemToan, double diemVan, String abc){
        return (diemToan+diemVan)/2;
    }
    public double tinhDTB(double diemToan, String abc, double diemVan){
        return (diemToan+diemVan)/2;
    }
    @Override
    public String toString() {
        return "SinhVien [hoTen = " + hoTen + ", diem = " + diem + "]";
    }
    //Constructors
    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }
    //Phương thức
    public SinhVien(String hoTenx) {
        hoTen = hoTenx;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //support method
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //service method  
    public void checkDiemHopLe(){
        if(checkDiem()){
            System.out.println("Diem hop le, tiep tuc nhap thong tin");
        }
        else
            System.out.println("Kiem tra lai...");
    }
    //parameter list
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x : arr){
            tong+=x;
        }
        return tong;
    }
}

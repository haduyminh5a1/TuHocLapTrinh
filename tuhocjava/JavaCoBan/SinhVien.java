public class SinhVien {
    //Thuộc tính
    public String hoTen;
    public String maSV;
    public double diemTB;
    //Constructor
    public SinhVien(){
    }

    public SinhVien(double diemTB, String hoTen, String maSV) {
        this.diemTB = diemTB;
        this.hoTen = hoTen;
        this.maSV = maSV;
    }
    

    //Phương thức
    public String thongTinSinhVien(){
        return "["+ hoTen + ", " + maSV + ", "+ diemTB + "]";
    }
    void xemDiem(){
        System.out.println("Diem cua sinh vien: " + diemTB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SinhVien{");
        sb.append("hoTen=").append(hoTen);
        sb.append(", maSV=").append(maSV);
        sb.append(", diemTB=").append(diemTB);
        sb.append('}');
        return sb.toString();
    }

}

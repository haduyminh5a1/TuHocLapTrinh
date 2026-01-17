package Enum;

public class SinhVien {
    //Thuộc tính
    private int ma;
    private String ten;
    private double diemTB;
    private XepLoai loai;
    //Constructors

    public SinhVien(int ma, String ten, double diemTB) {
        this.ma = ma;
        this.ten = ten;
        this.diemTB = diemTB;
        this.loai = getLoai();
    }
    //Phương thức xếp loại
    public XepLoai getLoai(){
        if (this.diemTB>=8)
            loai=XepLoai.gioi;
        else if (this.diemTB>=6.5)
            loai=XepLoai.kha;
        else if (this.diemTB>=5)
            loai=XepLoai.trungBinh;
        else if (this.diemTB>3.5)
            loai=XepLoai.yeu;
        else
            loai=XepLoai.duoiHoc;
        return loai;
    }

    //toString

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+this.loai.mieuTa();
    }

}

package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;
    public NhanVien(String ten,String que, int cccd ) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }
    public abstract double tinhLuong();

}

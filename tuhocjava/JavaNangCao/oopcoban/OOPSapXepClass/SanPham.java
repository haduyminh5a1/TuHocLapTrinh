package OOPSapXepClass;

public class SanPham implements Comparable<SanPham>{
    //Thuộc tính
    private int ma;
    private String ten;
    private double gia;
    //Constructors

    public SanPham(int ma, double gia, String ten) {
        this.ma = ma;
        this.gia = gia;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "[" + ma + " - " + gia + " - " + ten + "]";
    }

    //Phương thức
/*    @Override
   public int compareTo(SanPham o) {
        if (this.gia<o.gia)
            return -1;
        if (this.gia>o.gia)
            return 1;
        return 0;
    }*/

    @Override
    public int compareTo(SanPham o) {

        return this.ten.compareToIgnoreCase(o.ten);
    }
}

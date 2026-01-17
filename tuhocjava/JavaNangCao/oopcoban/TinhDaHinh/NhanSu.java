package TinhDaHinh;

public abstract class NhanSu {
    private String ten;
    private String cccd;
    private String que;
    //Constructors

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }
}

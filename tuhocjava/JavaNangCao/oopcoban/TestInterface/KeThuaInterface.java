package TestInterface;

public class KeThuaInterface implements Viduinterface{
    @Override
    public void thongTin(String ten, String que, String cccd) {
    }

    @Override
    public double tinhLuong(int luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}

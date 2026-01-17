package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());
        ArrayList<SinhVien> ds = new ArrayList<>();
        SinhVien sv1 = new SinhVien(1, "A",10);
        SinhVien sv2 = new SinhVien(2, "B",8);
        SinhVien sv3 = new SinhVien(3, "C",9.5);
        //add sinh vien
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        for (SinhVien ThongTinSV : ds) {
            System.out.println(ThongTinSV);
        }
    }
}

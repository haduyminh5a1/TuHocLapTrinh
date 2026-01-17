package OOPSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //Khởi tạo đối tương
        SanPham sp1 = new SanPham(1, 1050,"Samsung");
        SanPham sp2 = new SanPham(2, 500,"Iphone");
        SanPham sp3 = new SanPham(3, 800,"Vsmart");
        ds.add(sp1); ds.add(sp2); ds.add(sp3);
        for (SanPham sp : ds){
            System.out.println(sp);
        }
        Collections.sort(ds);
        System.out.println("Danh sach sau sap xep la: ");
        for (SanPham sp : ds){
            System.out.println(sp);
        }
    }
}

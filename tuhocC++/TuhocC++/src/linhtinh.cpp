#include <iostream>
#include <string>
#include <cstring>


using namespace std;

struct SinhVien{
    char msv[7];
    char hoTen[50];
    string tenLop;
    float diemqt;
    float diemgk;
    float diemck;
    float diemhp;
    void tinhdiemhp {
       return diemqt * 0.25 + diemgk * 0.25 + diemck * 0.5;
    }
}

struct Tenlop {
    string tenLop;
    Sinhvien ds[60]

}

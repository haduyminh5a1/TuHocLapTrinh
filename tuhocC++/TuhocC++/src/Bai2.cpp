#include <iostream>

using namespace std;

int main()
{
    //Xuất dữ liệu
    cout << "Hello world!" << endl;
    //Nhập dữ liệu từ bàn phím
    double toan, van, diemtb;
    cout << "Moi nhap vao diem Toan: ";
    cin >> toan;
    cout << "Moi nhap vao diem Van: ";
    cin >> van;

    diemtb = (toan + van)/2;

    cout << "Diem trung binh cua ban la: " << diemtb << "\n";
    cin.get();
    return 0;
}

#include <iostream>
#include <climits>
using namespace std;

int main(){
    cout << "max cua bien int la: " << INT_MAX << endl;
    cout << "min cua bien int la: " << INT_MIN << endl;
    //Khai bao
    int toan;
    float diemToan;
    double tienLuong;
    //Khai bao nhieu bien
    int a, b, c, d;
    //Khoi tao
    bool check = true;
    char kyTu = 'A';
    int canNang = 72;
    float diemVan = 9.5f;

    short test = 50000;
    cout << "Gia tri cua test la:" << test << endl;

    //
    cout << typeid(diemVan).name();
}
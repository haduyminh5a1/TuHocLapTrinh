#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>
#include <iomanip>
using namespace std;

int main(){
    //Baitap02
    cout << "Nhap vao ban kinh duong tron: "<< endl;
    float radius;
    cin >> radius;
    cout << "Dien tich hinh tron la: " << pow(radius, 2) * M_PI << endl;
    cout << "Chu vi hinh tron la: " << radius * 2 * M_PI << endl;
     
    //Baitap03
    float a, b;
    cout << "Nhap vao chieu dai a, b: " << endl;
    cin >> a;
    cin >> b;
    cout << "Dien tich hinh chu nhat canh a, b la: " << a * b << endl;
    cout << "Chu vi hinh chu nhat canh a, b la: " << (a + b) * 2 << endl;

    //Baitap04
    float x, y, z;
    cout << "Nhap vao diem 3 mon toan, van, anh: " << endl;
    cin >> x;
    cin >> y;
    cin >> z;
    cout << "Diem trung binh cua 3 mon la: " << (x + y + z)/3 << endl;
    cout << "Diem trung binh sau khi lam tron: " << setprecision(3) << (x + y + z)/3 << endl;
    
    return 0;
}
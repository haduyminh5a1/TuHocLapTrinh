#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>
using namespace std;

int main(){
    float dtb;
    cout << "Moi ban nhap vao diem trung binh: ";
    cin >> dtb;
    if (dtb >= 5.0){
        cout << "Do";
    }
    else {
        cout << "Truot";
    }
    // if else long nhau
    double dtb2;
    cout << "Moi ban nhap vao diem trung binh:";
    cin >> dtb2;
    if (dtb2 >= 8.0 && dtb2 <= 10){
        cout << "Gioi";
    } 
    else if (dtb2 >= 6.5){
        cout << "Kha";
    }
    else if (dtb2 >= 4.0) {
        cout << "Trung binh";
    }
    else {
        cout << "Yeu";
    }
    
    return 0;

    //Baitap05
    float tong, hieu;
    cout << "Nhap vao tong va hieu cua x, y: " << endl;
    cin >> tong >> hieu;
    cout << "x = " << (tong + hieu) / 2;
    cout << "y = " << (tong - hieu) / 2;
    
    //Baitap06
    float height, weight;
    cout << "Nhap vao chieu cao, can nang cua ban: " << endl;
    cin >> height >> weight;
    float BMI =  weight/(pow(height, 2));
    if (BMI < 15){
        cout << "Qua gay";
    }
    else if (BMI < 16){
        cout << "Hoi gay";
    }
    else if (BMI < 18.5){
        cout << "Binh thuong";
    }
    else if (BMI < 25){
        cout << "Hoi beo";
    }
    else if (BMI < 35){
        cout << "Beo";
    }
    else {
        cout << "Qua beo";
    }
    //Baitap07
    int year;
    cout << "Nhap vao nam: " << endl;
    cin >> year;
    if (((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)){
        cout << "Day la nam nhuan";
    }
    else {
        cout << "Day khong phai nam nhuan";
    }
    //Baitap08
    int month;
    cout << "Nhap vao thang: " << endl;
    cin >> month;
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
        cout << "Thang nay co 31 ngay";
    }
    else if (month == 2){
        cout << "Thang nay co 28 ngay";
    }
    else {
        cout << "Thang nay co 30 ngay";
    }
    //Baitap09
    float a, b, c;
    float delta = pow(b, 2) - 4 * a * c;
    cout << "Nhap vao 2 so a, b, c trong phuong trinh bac 2 ax^2 + bx + c: ";
    cin >> a >> b >> c;
    if (a == 0){
        if (b == 0 && c == 0){
            cout << "Phuong trinh vo so nghiem";
        }
        else{ 
            if (b == 0 && c != 0){
                cout << "Pt vo nghiem";
            }
            else {
                cout << "x = " << -c/b; 
            }
        }
    }
    else if (a != 0){
        if (delta > 0){
            float x1 = (-b - sqrt(delta))/(2 * a);
            float x2 = (-b + sqrt(delta))/(2 * a);
            cout << "x1 = " << x1 <<"\nx2 = " << x2;
        }
        else if (delta == 0){
            cout << "x = " << -b/2*a;
        }
        else if (delta < 0){
            cout << "Pt vo nghiem";
        }
    }
    //Baitap10
    int m;
    cout << "Nhap vao thang: ";
    cin >> m;
    if (m >= 1 || m <= 3){
        cout << "Quy 1";
    }
    else if (m >= 4 && m <= 6){
        cout << "Quy 2";
    }
    else if (m >= 7 && m <= 9){
        cout << "Quy 3";
    }
    else {
        cout << "Quy 4";
    }
    return 0;
}
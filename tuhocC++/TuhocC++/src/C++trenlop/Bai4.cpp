#include <fstream>
#include <iostream>
#include <string>
using namespace std;

struct SinhVien {
    string ten;
    float diem[50];
    int soMonDuoiTrungBinh = 0;
};

int main(){
    ifstream inFile("Bai4.txt");
    if (!inFile.is_open()){
        cout << "Khong the mo file, kiem tra lai vi tri file" << endl;
        return -1;
    }
    int soMonHoc;
    if (!(inFile >> soMonHoc)){
        inFile.close();

        cout << "Khong doc duoc so mon hoc do file chua ton tai, vui long nhap so mon hoc";
        int soMonHoc; cin >> soMonHoc;
        ofstream outFile("Bai4.txt");
        outFile << soMonHoc << endl;
        outFile.close();
    }
    inFile.close();
    ofstream outFile("Bai4.txt", ios::app); 
    
    if (outFile.is_open()) {
        string tenMoi;
        cout << "Nhap ten sinh vien moi: ";
        getline(cin, tenMoi);
        outFile << tenMoi << endl;
        
        cout << "Nhap " << soMonHoc << " diem: ";
        float diem;
        for (int i = 0; i < soMonHoc; i++) {
            cin >> diem;
            outFile << diem << (i == soMonHoc - 1 ? "" : " ");
        }
        outFile << endl;

        outFile.close();
        cout << "Da ghi them du lieu thanh cong!" << endl;
    }

    return 0;
}
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

const int MAX_SV = 100;
const int MAX_MON = 50;

struct SinhVien {
    string hoTen;
    float diem[MAX_MON];
    float diemTB;
    int soMonHocLai;
};

void nhapDanhSach(SinhVien ds[], int n, int m) {
    cin.ignore();

    for (int i = 0; i < n; i++) {
        cout << "\nNhap thong tin sinh vien thu " << i + 1 << endl;

        cout << "Ho va ten: ";
        getline(cin, ds[i].hoTen);

        for (int j = 0; j < m; j++) {
            do {
                cout << "Diem mon " << j + 1 << ": ";
                cin >> ds[i].diem[j];

                if (ds[i].diem[j] < 0 || ds[i].diem[j] > 10) {
                    cout << "Diem khong hop le. Vui long nhap lai!\n";
                }

            } while (ds[i].diem[j] < 0 || ds[i].diem[j] > 10);
        }

        cin.ignore();
    }
}

float tinhDiemTB(SinhVien sv, int m) {
    float tong = 0;

    for (int i = 0; i < m; i++) {
        tong += sv.diem[i];
    }

    return tong / m;
}

int demSoMonHocLai(SinhVien sv, int m) {
    int dem = 0;

    for (int i = 0; i < m; i++) {
        if (sv.diem[i] < 4) {
            dem++;
        }
    }

    return dem;
}

void capNhatThongTin(SinhVien ds[], int n, int m) {
    for (int i = 0; i < n; i++) {
        ds[i].diemTB = tinhDiemTB(ds[i], m);
        ds[i].soMonHocLai = demSoMonHocLai(ds[i], m);
    }
}

bool datHocBong(SinhVien sv) {
    return sv.diemTB >= 8.0 && sv.soMonHocLai == 0;
}

void xuatDanhSach(SinhVien ds[], int n, int m) {
    cout << "\nDANH SACH SINH VIEN\n";

    cout << left << setw(5) << "STT"
         << setw(25) << "Ho va ten";

    for (int i = 0; i < m; i++) {
        cout << setw(10) << ("Mon " + to_string(i + 1));
    }

    cout << setw(10) << "DTB"
         << setw(15) << "Hoc lai"
         << setw(15) << "Hoc bong"
         << endl;

    for (int i = 0; i < n; i++) {
        cout << left << setw(5) << i + 1
             << setw(25) << ds[i].hoTen;

        for (int j = 0; j < m; j++) {
            cout << setw(10) << ds[i].diem[j];
        }

        cout << setw(10) << fixed << setprecision(2) << ds[i].diemTB
             << setw(15) << ds[i].soMonHocLai;

        if (datHocBong(ds[i])) {
            cout << setw(15) << "Dat";
        } else {
            cout << setw(15) << "Khong";
        }

        cout << endl;
    }
}

void xuatSinhVienDatHocBong(SinhVien ds[], int n, int m) {
    cout << "\nDANH SACH SINH VIEN DAT HOC BONG\n";

    bool coSinhVien = false;

    cout << left << setw(5) << "STT"
         << setw(25) << "Ho va ten"
         << setw(10) << "DTB"
         << endl;

    for (int i = 0; i < n; i++) {
        if (datHocBong(ds[i])) {
            coSinhVien = true;

            cout << left << setw(5) << i + 1
                 << setw(25) << ds[i].hoTen
                 << setw(10) << fixed << setprecision(2) << ds[i].diemTB
                 << endl;
        }
    }

    if (!coSinhVien) {
        cout << "Khong co sinh vien nao dat hoc bong.\n";
    }
}

int main() {
    SinhVien ds[MAX_SV];

    int n;
    int m;

    cout << "Nhap so luong sinh vien: ";
    cin >> n;

    cout << "Nhap so luong mon hoc: ";
    cin >> m;

    nhapDanhSach(ds, n, m);

    capNhatThongTin(ds, n, m);

    xuatDanhSach(ds, n, m);

    xuatSinhVienDatHocBong(ds, n, m);

    return 0;
}
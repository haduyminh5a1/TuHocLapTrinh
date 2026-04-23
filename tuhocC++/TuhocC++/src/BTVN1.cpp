#include <iostream>
#include <algorithm>
using namespace std;

struct SinhVien {
    string name;
    double scores[10];
};

double dtb(double scores[]);
bool validCheck(double scores[]);
bool soSanhDTB(SinhVien a, SinhVien b){
    return dtb(a.scores) > dtb(b.scores);
}
void xepHang(SinhVien sv[], int n);

int main(){
    cout << "Nhap vao so sinh vien trong danh sach: ";
    int n; cin >> n;
    cin.ignore();
    
    SinhVien sv[n];

    for (int i=0;i<n;i++){
        cout << "Nhap vao thong tin sinh vien thu " << i+1 << endl;
        getline(cin, sv[i].name);
        for (int j=0;j<10;j++){
            cin >> sv[i].scores[j];
        }
        cin.ignore();
        cout << endl;
    }

    sort(sv, sv + n, soSanhDTB);

    cout << "Danh sach sinh vien dat hoc bong: " << endl;
    xepHang(sv, n);
}

double dtb(double scores[]){
    double dtb = 0;
    for (int i=0;i<10;i++){
        dtb += scores[i];
    }
    return dtb/10;
}

bool validCheck(double scores[]){
    for (int i=0;i<10;i++){
        if (scores[i] < 5.5){
            return false;
        }
    }
    return true;
}

void xepHang(SinhVien sv[], int n){
    for (int i=0;i<n;i++){
        double tb = dtb(sv[i].scores);
        if (tb < 7 || !validCheck(sv[i].scores)){
            cout << "Sinh vien " << sv[i].name << " chua du dieu kien dat hoc bong!" << endl;
        }
        else if (tb < 8){
            cout << "Sinh vien " << sv[i].name << " hoc bong loai C" << endl;
        }
        else if (tb < 9){
            cout << "Sinh vien " << sv[i].name << " hoc bong loai B" << endl;
        }
        else {
            cout << "Sinh vien " << sv[i].name << " hoc bong loai A" << endl;
        }
    }
}
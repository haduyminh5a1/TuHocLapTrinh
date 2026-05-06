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
    ifstream inFile("Bai3.txt");
    ofstream outFile("OutputBai3.txt");
    if (!inFile.is_open()){
        cout << "Khong the mo file, kiem tra lai vi tri file" << endl;
        return -1;
    }

    int soMonHoc;
    inFile >> soMonHoc;
    inFile.ignore();

    int stt=0;
    SinhVien sv[100];
    string line;
    while (getline(inFile, line)){
        if (!line.empty()){
            sv[stt].ten = line;

            for (int i=0;i<soMonHoc;i++){
                inFile >> sv[stt].diem[i];
                if (sv[stt].diem[i] < 5.5){
                    sv[stt].soMonDuoiTrungBinh++;
                }
            }
            
            inFile.ignore();
            stt++;
        }
    }
    cout << "Ket qua hoc tap:" << endl;
    for (int i = 0; i < stt; i++) {
        cout << "SV: " << sv[i].ten << " | So mon < 5.5: " << sv[i].soMonDuoiTrungBinh << endl;
        outFile << "SV: " << sv[i].ten << " | So mon < 5.5: " << sv[i].soMonDuoiTrungBinh << endl;
    }

    inFile.close();
    outFile.close();
    cout << "Da luu ket qua vao file" << endl;

    return 0;
}
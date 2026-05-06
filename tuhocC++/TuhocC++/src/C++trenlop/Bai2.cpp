#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(){
    ifstream inFile("Bai2.txt");
    if (!inFile.is_open()){
        cout << "Khong the mo file, kiem tra lai vi tri file" << endl;
        return -1;
    }
    string line;
    int soTinhThanh = 0;
    while (!inFile.eof()){
        getline(inFile, line);
        if (!line.empty()){
            cout << line << endl;
            soTinhThanh++;
        }
    }
    cout << "Co tong cong " << soTinhThanh << " tinh thanh trong file";
    inFile.close();
    return 0;
}
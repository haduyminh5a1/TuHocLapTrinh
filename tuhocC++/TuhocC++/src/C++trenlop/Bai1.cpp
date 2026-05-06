#include <fstream>
#include <iostream>
using namespace std;

int main(){
    ifstream inFile("Bai1.txt");
    if (!inFile.is_open()){
        cout << "Khong the mo file, kiem tra lai vi tri file" << endl;
        return -1;
    }
    int rows, cols;
    inFile >> rows >> cols;
    int matran[rows][cols];

    for (int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            inFile >> matran[i][j];
        }
    }

    cout << "Mang 2 chieu trong file: " << endl;
    for (int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            cout << matran[i][j] << " ";
        }
        cout << endl;
    }

    inFile.close();
    return 0;
}
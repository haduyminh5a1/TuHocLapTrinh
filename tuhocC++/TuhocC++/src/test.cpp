#include<iostream>
using namespace std;

void nhapDay(int Thanh[], int n){
    for (int i=0;i<n;i++){
        cout << "Nhap vao phan tu thu" << i+1;
        cin >> Thanh[i];
    }        
}
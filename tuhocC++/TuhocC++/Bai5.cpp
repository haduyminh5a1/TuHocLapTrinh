#include <iostream>
using namespace std;

int main(){
    //1. Ep kieu du lieu
    short a = 10;
    //Xuat gia tri cua a
    cout << "a = " << a << endl;
    
    //Khai bao b(int)
    int b;
    b = a; //Ep tat
    b = (int)a; //Ep tuong minh
    cout << "b = " << b << endl;
    
    //2. Ep kieu hep(ep tu lon sang be)
    float soA = 1.25f;
    int soB;
    soB = soA;
    soB = (int) soA;
    
    cout << soA << endl;
    cout << soB << endl;

    return 0;
}
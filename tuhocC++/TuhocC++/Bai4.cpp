#include <iostream>
using namespace std;

int main(){
    //Hang so
    const int DOSOI = 100;    
    const int DODONG = 0;
    
    cout << "Nhiet do soi: " << DOSOI << endl;
    cout << "Nhiet do dong: " << DODONG << endl;
    //Type promotion
    int a = 8;
    double b = 7.5;
    
    cout << a+b << endl;
    int kq = a+b;
    cout << kq;
}
#include <iostream>
using namespace std;

int main(){
    for (int i=0;i<=10;i++){
        cout << i << endl;
    }
    
    int tong = 0;
    for (int i=0;i<10;i++){
        tong += i;
    }
    cout << tong;
    return 0;
}
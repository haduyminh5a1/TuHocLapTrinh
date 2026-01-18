#include <iostream>
using namespace std;

int main(){
    int tong = 0;
    for (int i=0;i<=5;i++){
        if (i==2){
            continue;
        }
        else{
            cout << i << endl;
            tong += i;
        }
    }
    cout << tong << endl;

    int n = 0;
    while (n<100){
        n++;
        cout << n << endl;
        if (n == 9){
            break;
        }
    }
    //Baitap13
    int m;
    cin >> m;
    int temp = m;
    int giaiThua = 1;
    for (int i=1;i<=m;i++){
        giaiThua*=i;
    }
    cout << giaiThua;
    m = temp;
    int count = 1;
    while (giaiThua <= m){
        giaiThua*= count;
    }
    cout << giaiThua;
    //Baitap14
    
    return 0;
}
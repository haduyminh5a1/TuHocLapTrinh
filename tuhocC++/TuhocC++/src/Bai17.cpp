#include <iostream>
using namespace std;

int cong(int a, int b){
    return a + b;
}
//Ham thu tuc
void xinChao(string gioiTinh){
    if (gioiTinh == "nu"){
        cout << "Xin chao, toi la nu" << endl;
    }
    else {
        cout << "Xin chao, toi la nam" << endl;
    }
}

int main(){
    int kq = cong(7,6);
    cout << kq;
    return 0;
}
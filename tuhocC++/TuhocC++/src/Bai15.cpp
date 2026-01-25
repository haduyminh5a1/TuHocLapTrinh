#include <iostream>
using namespace std;

int main(){
    // int tong = 0;
    // for (int i=0;i<=5;i++){
    //     if (i==2){
    //         continue;
    //     }
    //     else{
    //         cout << i << endl;
    //         tong += i;
    //     }
    // }
    // cout << tong << endl;

    // int n = 0;
    // while (n<100){
    //     n++;
    //     cout << n << endl;
    //     if (n == 9){
    //         break;
    //     }
    // }
    // //Baitap13
    // int m;
    // cin >> m;
    // int temp = m;
    // int giaiThua = 1;
    // for (int i=1;i<=m;i++){
    //     giaiThua*=i;
    // }
    // cout << giaiThua;
    // m = temp;
    // int count = 1;
    // while (giaiThua <= m){
    //     giaiThua*= count;
    // }
    // cout << giaiThua;
    // //Baitap14
    // int a;
    // cout << "Moi nhap vao so a: ";
    // cin >> a;
    // int sum = 0;
    // if (a & 1 == 0){
    //     for (int i=0;i<=a;i+=2){
    //         sum +=i;
    //     }
    //     cout << "Tong cac so chan: ";
    // }
    // else {
    //     cout << "Khong tinh tong nay";
    // }
    // //Baitap15
    // //D muon lam
    // //Baitap16
    // cout << "Cac so chia het cho 3 la: ";
    // for (int i=10;i<=50;i++){
    //     if (i % 3 == 0){
    //         cout << i;
    //     }
    // }
    // //Baitap17
    // long long tongGT = 0;
    // long long giaiThua = 1;
    // for (int i=1;i<=10;i++){
    //     giaiThua *= i;
    //     tongGT += giaiThua;
    // }
    // cout << tongGT;
    //Baitap18
    // int pnum;
    // cout << "Nhap vao so can kiem tra: ";
    // cin >> pnum;
    // int check = 0;
    // for (int i=1;i<=pnum/2;i++){
    //     if (pnum % i == 0){
    //         check += i;
    //     }
    // }
    // if (check == pnum){
    //     cout << "Day la so hoan hao";
    // }
    // cout << "Cac so hoan hao trong doan (1, 1000): " << endl;
    // for (int i=1;i<=1000;i++){
    //     int sum = 0;
    //     for (int j=1;j<=i/2;j++){
    //         if (i % j == 0){
    //             sum += j;
    //         }
    //     }
    //     if (sum == i){
    //         cout << i << " ";
    //     }
    // }
    //Baitap19
    int b;
    string answer;
    do {
        cout << "Moi nhap vao so nguyen b: ";
        cin >> b;
        while (b < 0) {
            cout << "Moi nhap lai so lon hon 0: ";
            cin >> b;
        }

        if (b < 2) {
            cout << "Day khong phai so nguyen to" << endl;
        } else if (b == 2) {
            cout << "Day la so nguyen to" << endl;
        } else if (b % 2 == 0) {
            cout << "Day khong phai so nguyen to" << endl;
        } else {
            bool isPrime = true; 
            for (int i = 3; i * i <= b; i += 2) {
                if (b % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) 
                cout << "Day la so nguyen to" << endl;
            else 
                cout << "Day khong phai so nguyen to" << endl;
        }

        cout << "Ban co muon tiep tuc khong? (Y/N): ";
        cin >> answer;
    } while (answer == "Y" || answer == "y");

    return 0;
}
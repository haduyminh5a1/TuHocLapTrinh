#include <iostream>

using namespace std;

int main(){
    while(true){
        int a;
        cout << "Moi ban nhap vao so nguyen duong a: ";
        cin >> a;
        if ( a <= 0){
           cout << "Vui long nhap so nguyen > 0 tu ban phim!" << "\n";
           continue;
        }
        bool nguyen_to = true;

        if (a < 2){
            nguyen_to = false;
        }
        for (int i = 2; i < a; i++){
            if ( a % i == 0){
                nguyen_to = false;
                break;
            }
        }
        if (nguyen_to == true){
            cout << a << " la so nguyen to" << endl;
        }
        else{
            cout << a << " khong la so nguyen to" << endl;
        }
        string traloi;
        cout << "Ban co muon tiep tuc khong?" << endl;
        cout << "Bam n/N de nghi \n";
        cin >> traloi;

        if (traloi == "n" || traloi == "N"){
            break;
        }
        else{
            continue;
        }
    }
}
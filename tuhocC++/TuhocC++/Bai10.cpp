#include <iostream>
using namespace std;

int main(){
    //Khai bao bien
    int n;
    cout << "Moi nhap vao n: ";
    cin >> n;
    string check = (n%2 == 0) ? "Chan" : "Le";
    cout << check << endl;
    //Baitap11
    float score;
    cout << "Moi nhap vao diem: ";
    cin >> score;
    string rank = (score >= 8.5) ? "Gioi" : ((score >= 6.5) ? "Kha" : ((score >= 5 ? "Trung binh" : "Yeu"))); 
    cout << rank;

    return 0;
}
#include <iostream>
using namespace std;

int main(){
    //Nhap vao n + kiem tra
    int n;
    cout << "Moi nhap vao so nguyen n: ";
    cin >> n;
    
    int div = n%2;
    switch (div){
        case 0:
            cout << "Chan";
            break;
        default:
            cout << "Le";
            break;
    }
    
    //switch case bien the
    int month;
    cout << "Moi nhap vao thang: ";
    cin >> month;

    switch (month)
    {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        cout << "Thang nay co 31 ngay";
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        cout << "Thang nay co 30 ngay";
        break;
    case 2:
        cout << "Thang nay co 28 hoac 29 ngay";
        break;
    }
    //Baitap12
    int opt;
    cout << "Moi ban nhap vao lua chon: ";
    cout << "1. Tim theo ten\n2.Tim theo tac gia\n3.Tim theo nha xuat ban\nTim theo tieu de" << endl;
    cin >> opt;
    switch (opt)
    {
    case 1:
        cout << "Tim theo ten";
        break;
    case 2:
        cout << "Tim theo tac gia";
        break;
    case 3:
        cout << "Tim theo nha xuat ban";
        break;
    case 4: 
        cout << "Tim theo tieu de";
        break;
    default:
        cout << "Khong hop le";
        break;
    }
    
    return 0;
}
#include <iostream>
using namespace std;

int main(){
    int x = 0;
    while (x <= 5)
    {
        cout << "x = " << x << endl;
        x++;
    }
    
    int n;
    cout << "Moi ban nhap n = {1, 99}: ";
    cin >> n;
    while (n<1 || n>=99){
        cout << "Ban da nhap sai, vui long nhap lai: ";
        cin >> n;
    }
    return 0;
}
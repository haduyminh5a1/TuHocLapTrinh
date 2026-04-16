#include <iostream>
#include <string>
#include <algorithm> 

using namespace std;

int main() {
    int a;
    cout << "Nhap so: ";
    cin >> a;

    if (a == 0) {
        cout << "Dang nhi phan: 0" << endl;
        return 0;
    }

    string s = "";
    while (a > 0) {
        s += to_string(a & 1);
        a >>= 1;
    }

    reverse(s.begin(), s.end());

    cout << "Dang nhi phan: " << s << "\n";
}
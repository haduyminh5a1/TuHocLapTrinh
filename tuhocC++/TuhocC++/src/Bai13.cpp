#include <iostream>
using namespace std;

int main(){
    //tong
    int a = 1;
    int sum = 0;
    do {
        sum += a;
        a++;
    } while (a<=5);

    //while (true)
    int n = 0;
    while (true){
        cout << n << endl;
        n++;
        if (n == 5){
            return false;
        }
    }
    cout << sum;

    return 0;
}
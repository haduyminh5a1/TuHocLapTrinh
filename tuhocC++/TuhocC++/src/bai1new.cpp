#include <iostream>
#include <string>
using namespace std;

int main(){
    string bit;
    cin >> bit;
    int ans = 0;

    for (int i=0;i<(int) bit.size();i++){
        ans = (ans << 1) + (bit[i] - '0');
    }
    
    cout << ans;
}
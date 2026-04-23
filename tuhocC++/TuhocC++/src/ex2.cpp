#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve() {
    int n;
    cin >> n;

    vector<bool> mark(1000002, false); 

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        if (x > 0 && x <= 1000000) {
            mark[x] = true;
        }
    }

    for (int i = 1; i <= 1000001; i++) {
        if (!mark[i]) {
            cout << i << "\n";
            return;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
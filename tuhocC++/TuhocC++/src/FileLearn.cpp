#include <fstream>
#include <iostream>
using namespace std;

int main(){
    ifstream inFile("data.txt");
    if (inFile.fail()){
        cout << "Fail to open file" << endl;
        return -1;
    }
    float so[100];
    int n=0;
    while (!inFile.eof()){
        inFile >> so[n];
        n++;
    }
    inFile.close();
    cout << "so ptu trong file: " << n << endl;
    for (int i=0;i<n;i++){
        cout << so[i] << " ";
    }
    return 0;
}
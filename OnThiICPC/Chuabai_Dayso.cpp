#include <math.h>
#include <iostream>
using namespace std;
int main()
{
    int n, k;
    int a[10005];
    cin>>n>>k;
    for(int i=1;i<=n;i++){
        cin>>a[i];
    }
    int f[10005]; //luu diem lon nhat cua day neu ket thuc tai a[i]
    for(int i=1;i<=n;i++){
        f[i]=-pow(10,10);
    }
    //f(n) = max (f[n-1],f[n-2],...f[n-k]) + a[n]
    f[0]=0;
    int maxk=-pow(10,10);
    for(int i=1;i<=n;i++){
        int maxk=-pow(10,10);
        for(int j=i-k;j<i;j++){
            if (j<0) {
                maxk=max(maxk, 0);
                continue;
            }
            else{
                maxk=max(maxk, f[j]);
            }
        } //tim max f (n-1->k)
        f[i]=a[i]+maxk;
    }
    int kq=-pow(10,10);
    for(int i=0;i<=n;i++) if (kq < f[i]) kq=f[i];
    cout<<kq;
    return 0;
}
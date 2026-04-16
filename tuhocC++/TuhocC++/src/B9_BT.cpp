#include<iostream>
#include<cmath>
using namespace std;

void nhapmang(int a[],int &n)
{
	do
	{
	cout<<"Nhap so ptu mang:";
	cin>>n;
	}while(n<=0);
	
	for(int i=0;i<n;i++)
	{
		cout<<"Nhap a["<<i<<"]=";
		cin>>a[i];
	}
}

void xuatmang(int a[],int n)
{
	cout<<"Mang vua nhap la:"<<endl;
	for(int i=0;i<n;i++)
		cout<<a[i]<<" ";
}

bool ktsnt(int n)
{
	int ok=1;
	if(n==1)
		ok=0;
	else
		if(n<4)
			ok=1;
		else
		{
			for(int i=2;i<=sqrt(n);i++)
				if(n%i==0)
					ok=0;
		}
	if(ok==1)
		return true;
	else
		return false;
}
void vtsntdt(int a[],int n)
{
	bool found=false;
	for(int i=0;i<n;i++)
		if(ktsnt(a[i])==true)
		{
			cout<<"Vi tri snt dau tien la:"<<i;
			found=true;
			break;
		}
	if(found==false)
		cout<<"Ko co snt trong mang";
}
void them(int a[],int &n,int x,int vt)
{
	if((vt>=0)&&(vt<n))
	{
		for(int i=n;i>vt;i--)
			a[i]=a[i-1];
		a[vt]=x;
		n=n+1;
	}
	else
		cout<<"Vi tri ko hop le";
		
	cout<<"Mang sau khi them la:"<<endl;
		xuatmang(a,n);
}
void xoa(int a[],int &n,int vt)
{
	if((vt>=0)&&(vt<n))
	{
		for(int i=vt;i<n;i++)
			a[i]=a[i+1];
		n=n-1;
	}
	else
		cout<<"Vi tri k hop le";
		
	cout<<"Mang sau khi xoa la:"<<endl;
		xuatmang(a,n);
}
//tim phan tu x o vi tri cuoi cung
//7 0 5 9 5 2  x=5 => vi tri:4
void vitricuoi(int a[],int n,int x)
{
	bool found=false;
	for(int i=n-1;i>=0;i--)
		if(a[i]==x)
		{
			cout<<"Vi tri:"<<i;
			found=true;
			break;
		}
	if(found==false)
		cout<<"Ko tim thay vi tri";
}
int main()
{
	int a[50];
	int n;
	nhapmang(a,n);
	xuatmang(a,n);
//	int vt,x;
//	cout<<"Nhap vi tri can chen:";
//	cin>>vt;
//	cout<<"Nhap phan tu can them:";
//	cin>>x;
//	them(a,n,x,vt);
//	int vt;
//	cout<<"Nhap vi tri can xoa:";
//	cin>>vt;
//	xoa(a,n,vt);
//	int x;
//	cout<<"Nhap phan tu can tim:";
//	cin>>x;
//	vitricuoi(a,n,x);
	vtsntdt(a,n);
}

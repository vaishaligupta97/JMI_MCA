#include<iostream>
using namespace std;

int binarysearch(int a[],int l,int h,int x);
int main()
{
	int n,x;
	int *a=new int[n];
	cout<<"Enter the size of array"<<endl;
	cin>>n;
	cout<<"Enter the elements of array"<<endl;
	for(int i=0;i<n;i++)
		cin>>a[i];
	int l=0,h=n-1;
	cout<<"Enter the element to be searched"<<endl;
	cin>>x;
	int index=binarysearch(a,l,h,x);
	if(index==-1)
		cout<<"element does not exist in array"<<endl;
	else
		cout<<"Element found at index= "<<index<<endl;
	return 0;
}
int binarysearch(int a[],int l,int h,int x)
{
	if(l==h)
	{
		if(x==a[l])
			return l;
		else
			return -1;
	}
	else
	{
		int mid=(l+h)/2;
		if(x==a[mid])
			return mid;
		else if(x<a[mid])
			return binarysearch(a,l,mid-1,x);
		else
			return binarysearch(a,mid+1,h,x);
	}
}


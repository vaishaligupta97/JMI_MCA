#include<iostream.h>
#include<conio.h>
template<class T>
class bubble
{
	T a[100];
	int size;
	public:
		void input()
		{
			cout<<"Enter the size of the array"<<endl;
			cin>>size;
			cout<<"Enter the array"<<endl;
			for(int i=0;i<size;i++)
			{
				cin>>a[i];
			}
		}
		void isort()
		{
			int p,j,temp;
			for(p=1;p<size;p++)             
			{
				for(j=0;j<(size-p);j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];                      
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}

			}
			cout<<"\nAfter Sorting : \n";
			for(int i=1;i<=size;i++)
			{
				cout<<a[i]<<endl;
			}
		}
};
int main()
{
	bubble<int>o1;
	o1.input();
	o1.isort();
}


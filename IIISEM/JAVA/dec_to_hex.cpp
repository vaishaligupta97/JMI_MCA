#include<iostream>
using namespace std;
int main()
{
        long int decinum, quot;
        char hexdecnum[100];
        int i=1, j, temp;
        cout<<"\n Enter Decimal Number : ";
        cin>>decinum;
        quot=decinum;
        while(quot!=0)
        {
                temp=quot%16;
                if(temp<10)   // Converts integer into character
                {
                        temp=temp+48;
                }
                else
                {
                        temp=temp+55;
                }
                hexdecnum[i++]=temp;
                quot=quot/16;
        }
        cout<<"\n Conversion of Decimal Number to Hexadecimal Number : ";
        for(j=i-1; j>0; j--)
        {
                cout<<hexdecnum[j];
        }
        return 0;
}

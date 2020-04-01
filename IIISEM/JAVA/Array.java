import java.util.*;

class Array
{
	public static void main(String args[])
	{
		int inf=Integer.MAX_VALUE;
	int a[]=new int[5];
	int b[]=new int[5];
	for(int i=0;i<5;i++)
	{
		if(i==2 ||i==4)
			a[i]=inf;
		else
			a[i]=2*i;
	}
	b=a;
	for(int i=0;i<5;i++)
	{
		System.out.print(b[i]+" ");
	}
	}
}
	
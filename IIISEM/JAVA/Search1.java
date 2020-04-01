import java.util.*;

class NewThread extends Thread
{
	static int a[];
	int start,end,x;
	int s;
	
	NewThread(int start,int end,int n,int x)
	{
		this.start=start;
		this.end=end;
		this.x=x;
		s=n;
	}
	
/*	{
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("enter the number of elements of array");
	//	n=sc.nextInt();
		
		
	}*/
	void getrandom()
	{
		a=new int[s];
		Random rand=new Random();
		for(int i=0;i<a.length;i++)
		{
			a[i]=rand.nextInt(10);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public void run()
	{
		int flag=0;
		while(start<=end)
		{
		//	System.out.println(start + " " +end);
			if(a[start]==x)
			{
				flag=1;
				break;
			}
			start++;
		}
		if(flag==1)
			System.out.println("element found at index "+ start);
		else
			System.out.println("element not found");
	}
}

class Search1
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the no of threads");
		int nt=sc.nextInt();
		System.out.println("Enter the element to be searched");
		int x=sc.nextInt();
		int start,end;
		start=0;
		int size=n/nt;
		end=size-1;
		for(int i=0;i<nt;i++)
		{
			NewThread t1=new NewThread(start,end,n,x);
			start=end+1;
			end=start+size-1;
			t1.getrandom();
			t1.start();
		}
	}
}
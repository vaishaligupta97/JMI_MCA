import java.util.*;

class NewThread extends Thread
{
	static int a[];
	int start,end,x;
	static int n;
	
	NewThread(int start,int end,int x)
	{
		this.start=start;
		this.end=end;
		this.x=x;
	}
	
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements of array");
		n=sc.nextInt();
		a=new int[n];
		Random rand=new Random(10);
		for(int i=0;i<a.length;i++)
		{
			a[i]=rand.nextInt(10);
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void run()
	{
		lsearch();
	}
	synchronized void lsearch()
	{
		try
		{
		wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught");
		}
		int flag=0;
		while(start<=end)
		{
		System.out.println(start + " " +end);
			if(a[start]==x)
			{
				flag=1;
				break;
			}
			start++;
		}
		if(flag==1)
		{
			System.out.println("element found at index "+ start);
			notify();
		}
		else
			System.out.println("element not found");
	}
	
}

class Search
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=NewThread.n;
		System.out.println("Enter the no of threads");
		int nt=sc.nextInt();
		System.out.println("Enter the element to be searched");
		int x=sc.nextInt();
		int start,end;
		start=0;
		int size=n/nt;
		end=size-1;
		for(int i=0;i<nt-1;i++)
		{
			NewThread t1=new NewThread(start,end,x);
			t1.start();
			start=end+1;
			end=start+size-1;
		}
		end=n-1;
		NewThread t1=new NewThread(start,end,x);
		t1.start();
	}
}
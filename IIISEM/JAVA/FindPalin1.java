import java.util.*;

class PalinThread extends Thread
{
	int l;
	static String str;
	int len;
	static
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
	}
	PalinThread(int l,int len)
	{
		this.l=l;
		this.len=len;
	}
	public void run()
	{
		for(int i=0;i<len-l+1;i++)
		{
			String s=str.substring(i,i+l);
			palindrome(s);
		}
	}
	public void palindrome(String stri)
	{
		boolean flag=true;
		int len=stri.length();
		for(int i=0,j=len-1;i<=j;i++,j--)
		{
			if(stri.charAt(i)!=stri.charAt(j))
				flag=false;
		}
		if(flag==true)
			System.out.println(stri);
	}
}

class FindPalin1
{
	public static void main(String args[])
	{
		int len=PalinThread.str.length();
		int k=3;
		for(int i=0;i<len-2;i++)
		{
			PalinThread t1=new PalinThread(k,len);
			t1.start();
			k=k+1;
		}
	}
}
		
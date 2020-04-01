import java.util.*;

class PalinThread extends Thread
{
	int l;
	String str;
	int len;
	PalinThread(int l,String str,int len)
	{
		this.l=l;
		this.str=str;
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

class FindPalin
{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
	//	PalinThread t[]=new PalinThread[len];
		int k=3;
		for(int i=0;i<len-2;i++)
		{
			PalinThread t1=new PalinThread(k,str,len);
			t1.start();
			k=k+1;
		}
	}
}
		
import java.util.*;

class PalinThread extends Thread
{
	int l;
	static String str;
	static int len;
	static
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		len=str.length();
	}
	PalinThread(int l)
	{
		this.l=l;
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
		StringBuffer s=new StringBuffer(stri);
		if(s.toString().equals(s.reverse().toString()))
			System.out.println(s);
	}
	
}

class FindPalin2
{
	public static void main(String args[])
	{
		int len=PalinThread.len;
		int k=3;
		for(int i=0;i<len-2;i++)
		{
			PalinThread t1=new PalinThread(k);
			t1.start();
			k=k+1;
		}
	}
}
		
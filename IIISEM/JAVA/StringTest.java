import java.util.*;

class StringTest
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Entered string: " + str);
		int len=str.length();
	//	System.out.println("string length: "+ len);
		char a[]=str.toCharArray();
		for(int k=2;k<len;k++)
		{
			for(int i=0;i<len-k+1;i++)
			{
				String s=new String(a,i,k);
				palindrome(s);
			//	System.out.println("new string : "+ s);
			}
		}
	//	palindrome(str);
	}
	public static void palindrome(String stri)
	{
		boolean flag=true;
		int len=stri.length();
	//	System.out.println("string length: "+ len);
		for(int i=0,j=len-1;i<=j;i++,j--)
		{
			if(stri.charAt(i)!=stri.charAt(j))
				flag=false;
		}
	//	if(flag==false)
	//		System.out.println("string: "+stri+" not palindrome");
		if(flag==true)
			System.out.println(stri);
	}
}
		
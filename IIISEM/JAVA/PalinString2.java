import java.util.*;

class PalinString2
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Entered string: " + str);
		int len=str.length();
		GenerateSubstring(str,len);
	}
	public static void GenerateSubstring(String str,int len)
	{
		System.out.println("Palindrome substrings are: ");
		for(int k=2;k<len;k++)
		{
			for(int i=0;i<len-k+1;i++)
			{
			//	n=len*(len-1)/2;
				String s=str.substring(i,i+k);
				palindrome(s);
			}
		}
	}
	public static void palindrome(String stri)
	{
		boolean flag=true;
		int len=stri.length();
		for(int i=0,j=len-1;i<=j;i++,j--)
		{
			if(stri.charAt(i)!=stri.charAt(j))
				flag=false;
		}
		String strArray[]=new String[10];
		String strArray1[]=new String[100];
		int k=0,m=0;
		if(flag==true)
		{
					strArray[k]=stri;
					k++;
		}
		for(int i=0;i<k;i++)
			for(int j=0;j<k;j++)
				if(strArray[i].equals(strArray[j])==false)
				{
					strArray1[m]=strArray[i];
					m++;
				}
		for(int i=0;i<m;i++)
					System.out.println(strArray1[i]);
	}
}
		
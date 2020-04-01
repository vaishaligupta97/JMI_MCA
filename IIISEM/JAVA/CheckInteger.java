import java.util.*;

class CheckInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int sum=0;
	/*	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
				sum+=Character.getNumericValue(ch);
		}*/
	/*	for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
			if(a>=48 && a<=57)
				 sum+=Character.getNumericValue(a);
		}*/
	/*	for(int i=0;i<str.length();i++)
			if(Character.isDigit(str.charAt(i)))
					sum+=Character.getNumericValue(str.charAt(i)); */
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
				if(Character.isDigit(ch))
					sum+=Integer.parseInt(String.valueOf(ch));
		}
		System.out.println(sum);
	}
}
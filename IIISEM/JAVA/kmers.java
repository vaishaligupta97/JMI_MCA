import java.util.*;

class Kmers
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		if(!arr.contains(str.charAt(i)))
		{
			arr.add(str.charAt(i));
		}
		StringBuffer sub=new StringBuffer();
		for(Character ch:arr)
			sub.append(ch);
		String s=sub.toString();
		System.out.println(s);
	//	System.out.println(arr);
	//	String s=arr.toString();
	//	System.out.println(s);
	/*	StringBuffer sub=new StringBuffer();
		for(int i=0;i<str.length()-2+1;i++)
		{
			String subst=str.substring(i,i+2);
			sub.insert(i,subst);
		}
		System.out.println(sub.charAt(1));
		String s=sub.toString();
		System.out.println("Substrings are" +s);*/
		
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<str.length()-2+1;i++)
		{
			String subst=str.substring(i,i+2);
			a.add(subst);
		}
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
	}
}
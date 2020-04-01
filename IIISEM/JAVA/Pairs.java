import java.util.*;

class Pairs
{
	static ArrayList<Character> arr=new ArrayList<Character>();
	static ArrayList <String> pair=new ArrayList<String>();
	static ArrayList<String> substrings=new ArrayList<String>();
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String ostr=sc.next();						//ATTGCCC
		System.out.println("Enter the value of k");
		int k=sc.nextInt();				//2
		find_unique(ostr);
	//	System.out.println(arr);
		StringBuffer sub=new StringBuffer();
		for(Character ch:arr)
			sub.append(ch);
		String str=sub.toString();
	//	System.out.println("unique element string"+str);		//str stores all unique elements. i. ATCG
		String newstr=new String();					//newstr stores all 16 pairs.
		findpairs(str,newstr,k);
	/*	for(int i=0;i<pair.size();i++)
			System.out.println(pair.get(i));    */
		findsubstrings(ostr,k);
	/*	System.out.println("all substrings of size " +k+" string");
		for(int i=0;i<substrings.size();i++)
			System.out.println(substrings.get(i));  */
		find_count();
	}
	public static void find_unique(String ostr) 
	{
		for(int i=0;i<ostr.length();i++)
			if(!arr.contains(ostr.charAt(i)))
			{
				arr.add(ostr.charAt(i));
			}
	}
	public static void findpairs(String str,String newstr,int k)
	{
		if(newstr.length()==k)
			pair.add(newstr);
		else
		{
			for(int i=0;i<str.length();i++)
			{
				String str1=newstr;
				newstr+=str.charAt(i);
				findpairs(str,newstr,k);
				newstr=str1;
			}
		}
	}
	public static void findsubstrings(String ostr,int k)
	{
		for(int i=0;i<ostr.length()-k+1;i++)
		{
			String subst=ostr.substring(i,i+k);
			substrings.add(subst);
		}
	}
	public static void find_count()
	{
		for(int i=0;i<pair.size();i++)
		{
			int count=0;
			for(int j=0;j<substrings.size();j++)
			{
				if(pair.get(i).equals(substrings.get(j)))
				{
					count++;
				}
			}
			System.out.println(pair.get(i)+" "+count);
		}
	}
}
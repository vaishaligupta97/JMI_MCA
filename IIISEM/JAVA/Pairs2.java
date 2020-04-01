import java.util.*;

class Pairs2
{
	static ArrayList<Character> arr=new ArrayList<Character>();
	static ArrayList <String> pair=new ArrayList<String>();
	static ArrayList<String> substrings=new ArrayList<String>();
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String ostr=sc.next();								//stores the original string, for eg. ATTGCCC
		System.out.println("Enter the value of k");
		int k=sc.nextInt();									//k stores the value of k-mers, for eg. 2
		find_unique(ostr);
		
		StringBuffer sub=new StringBuffer();
		for(Character ch:arr)
			sub.append(ch);
		String str=sub.toString();
		
		String newstr=new String();					//newstr stores all k-mers pairs,if k=2 then 16 pairs will be there
		find_pairs(str,newstr,k);
	
		find_substrings(ostr,k);
	
		find_count();
	}
	public static void find_unique(String ostr) 
	{
		for(int i=0;i<ostr.length();i++)
			if(!arr.contains(ostr.charAt(i)))
				arr.add(ostr.charAt(i));
	}
	public static void find_pairs(String str,String newstr,int k)
	{
		if(newstr.length()==k)
			pair.add(newstr);
		else
			for(int i=0;i<str.length();i++)
			{
				String str1=newstr;
				newstr+=str.charAt(i);
				find_pairs(str,newstr,k);
				newstr=str1;
			}
	}
	public static void find_substrings(String ostr,int k)
	{
		for(int i=0;i<ostr.length()-k+1;i++)
		{
			String subst=ostr.substring(i,i+k);
			substrings.add(subst);
		}
	}
	public static void find_count()
	{
		int arr_count[]=new int[pair.size()];
		for(int i=0;i<pair.size();i++)
		{
			 arr_count[i]=0;
			for(int j=0;j<substrings.size();j++)
				if(pair.get(i).equals(substrings.get(j)))
					arr_count[i]++;
		}
		for(int i=0;i<pair.size();i++)
			System.out.print(pair.get(i)+" ");
		System.out.println();
		for(int i=0;i<pair.size();i++)
			System.out.print(arr_count[i]+"  ");
	}
}
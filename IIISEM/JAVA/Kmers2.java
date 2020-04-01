import java.util.*;

class Kmers2
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
	
		ArrayList<String> pairs=new ArrayList<String>();
		for(int i=0;i<arr.size();i++)
			for(int j=0;j<arr.size();j++)
			{
				String st1=arr.get(i).toString();
				String st2=arr.get(j).toString();
				String st=String.join("",st1,st2);
				pairs.add(st);
			}
				
		ArrayList<String> substrings=new ArrayList<String>();
		for(int i=0;i<str.length()-1;i++)
		{
			String subst=str.substring(i,i+2);
			substrings.add(subst);
		}
		
		for(int i=0;i<pairs.size();i++)
		{
			int count=0;
			for(int j=0;j<substrings.size();j++)
			{
				if(pairs.get(i).equals(substrings.get(j)))
				{
					count++;
				}
			}
			System.out.println(pairs.get(i)+" "+count);
		}
	}
}
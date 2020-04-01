import java.util.*;

class Kmers3
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
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
		
	//	char array[]=s.toCharArray();*/
	//	String s=arr.toString();
	//	System.out.println("string"+s);
	
	public static void find_pairs(s,
	
		ArrayList<String> pairs=new ArrayList<String>();
		for(int i=0;i<arr.size();i++)
			for(int j=0;j<arr.size();j++)
			{
				String st=String.join("",arr.get(i).toString(),arr.get(j).toString());
				pairs.add(st);
			}
	/*	for(int i=0;i<pairs.size();i++)
		{
			System.out.println(pairs.get(i));
		} */
				
		ArrayList<String> substrings=new ArrayList<String>();
		for(int i=0;i<str.length()-k+1;i++)
		{
			String subst=str.substring(i,i+k);
			substrings.add(subst);
		}
	/*	System.out.println("all substrings are");
		for(int i=0;i<substrings.size();i++)
			System.out.println(substrings.get(i)); */
		
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
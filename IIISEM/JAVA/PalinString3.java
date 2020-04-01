import java.util.*;

class PalinString3
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
		
		if(flag==true)
		{
				ArrayList<String> myList = new ArrayList<String>();
					myList.add(stri);
				System.out.println(myList);
			//	ArrayList<String> newList =	removeDuplicates(myList);
			//	System.out.println(newList);
		//int n=newList.size();
		//System.out.println("array size: "+n);
	//	Object[] result = newList.toArray(); 
  
        // Printing array of objects 
      //  for (Object obj : result) 
        //    System.out.println(obj); 
		}
	}
	public static <String> ArrayList<String> removeDuplicates(ArrayList<String> myList) 
    {
			ArrayList<String> newList = new ArrayList<String>(); 
   
        for (String element : myList)
		{
            if (!newList.contains(element))
				newList.add(element); 
        } 
		return newList;
	}
}
		
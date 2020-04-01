import java.util.*;

class StringToken
{
	public static void main(String args[])
	{

		ArrayList <String> s=new ArrayList <String>();
		StringBuffer sb=new StringBuffer();
		String language="c|c++|java\n python|r|matlab";
		StringTokenizer token=new StringTokenizer(language,"|");
		while(token.hasMoreTokens())
		{
		//	s=token.nextToken();
		//	System.out.println(s);
			s.add(token.nextToken());
		}

		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
	}
}
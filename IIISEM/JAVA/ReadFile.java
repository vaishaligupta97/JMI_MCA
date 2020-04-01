import java.util.*;
import java.io.*;
public class ReadFile
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fileReader = new FileReader("data.txt");
		String str= "";
		int i ;
		while((i =  fileReader.read())!=-1)
		{
			char ch = (char)i;
			str = str + ch; 
		}
		System.out.println(str);
	}
}
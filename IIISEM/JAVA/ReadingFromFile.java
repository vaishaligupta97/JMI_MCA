// Java Program to illustrate reading from 
// FileReader using FileReader 
import java.io.*; 
public class ReadingFromFile 
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	FileReader fr = new FileReader("C:\\Users\\chirag\\Desktop\\vaishali_mca_java\\data.txt"); 
	
	String s=" ";
	char ch;
	while ((ch=fr.read()) != '\0')	
	{
		s+=ch;
	}
	System.out.print(s); 
} 
} 

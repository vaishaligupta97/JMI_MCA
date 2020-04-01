import java.util.*;
import java.io.*;

class PalinThread extends Thread
{
	int l;
	static String str;
	static int len;
		File f; 
			FileWriter fw = new FileWriter(f);
	static
	{
		try{
		FileReader fileReader = new FileReader("data.txt");
		str= "";
		int i ;
		while((i =  fileReader.read())!=-1)
		{
			char ch = (char)i;
			str = str + ch; 
		}
		len=str.length();
		}catch (IOException iox) {
            iox.printStackTrace();
		}
	}
	PalinThread(int l)
	{
		this.l=l;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<len-l+1;i++)
			{
				String s=str.substring(i,i+l);
				StringBuffer sb=new StringBuffer(s);
				if(sb.toString().equals(sb.reverse().toString()))
					fw.write(s);
			}
			fw.close();
		}catch (IOException iox) {
				iox.printStackTrace(); }
	}
}

class FindPalin3
{
	public static void main(String args[])
	{
		int len=PalinThread.len;
		int k=3;
		for(int i=0;i<len-2;i++)
		{
			PalinThread t1=new PalinThread(k);
			t1.start();
			k=k+1;
		}
	}
}
		
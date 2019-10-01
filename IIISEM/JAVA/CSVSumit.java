import java.io.*;
class A
{
ArrayList<String> myList=new Arraylist<String>(){"My","Name","is","Sumit","Nagpal"};
FileWriter f=new FileWriter("Sumit.csv");
File file=new File("Sumit.csv");
if(file.isFile())
	{
	System.out.println("File is Created");
	for(int i=0;i<myList.size();i++)
		fw.append(String.join("|",myList));
	fw.append("\n");
	f.flush();
	f.close();
	BufferReader bf=new BufferReader(new FileReader("Sumit.csv"));
	while((row=bf.readLine())!=null))
	{
		
	}
	}
	else
	System.out.println("File Not Found");
}


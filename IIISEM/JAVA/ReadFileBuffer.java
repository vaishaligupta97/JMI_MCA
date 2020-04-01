import java.util.*;
import java.io.*;
class ReadFileBuffer
{
public static void main(String args[])
{
BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chirag\\Desktop\\vaishali_mca_java\\data.txt"));
StringBuilder stringBuilder = new StringBuilder();
String line = null;
String ls = System.getProperty("line.separator");
while ((line = reader.readLine()) != null) {
	stringBuilder.append(line);
	stringBuilder.append(ls);
}
// delete the last new line separator
stringBuilder.deleteCharAt(stringBuilder.length() - 1);
reader.close();

String content = stringBuilder.toString();
System.out.println("content is" +content);
}
}

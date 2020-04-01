import java.io.*;

public class WriteFile {

    public static void main(String[] args) {

        try {
            String str = "SomeMoreTextIsHere";
            File newTextFile = new File("C:\\Users\\chirag\\Desktop\\vaishali_mca_java\\data1.txt");

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(str);
            fw.close();

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
    }
}
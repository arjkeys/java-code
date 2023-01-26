/*
Java program to append text to an existing file
Note: Rename this filename as Main.java or your wish
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
  
public class ArjKeys 
{
    public static void main(String a[])
    {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename= "ArjKeys.txt";
            FileWriter fw = new FileWriter(filename,true); 
            //appends the string to the file
            fw.write("Java Basic I/O Problems\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("ArjKeys.txt"));
            //read the file content
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}

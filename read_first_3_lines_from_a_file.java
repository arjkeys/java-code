/*
Java program to read first 3 lines from a file
Note: Rename this filename as Main.java or your wish
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
  
public class Arjkeys 
{
  
    public static void main(String a[])
    {
        BufferedReader br = null;
        String strLine = "";
        try
        {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("Arjkeys.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3)
            {
                System.out.println(strLine);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.err.println("File not found");
        } 
        catch (IOException e) 
        {
            System.err.println("Unable to read the file.");
        }
     }
}

/*
Read a file content line by line - Java
Note: Rename this filename as Main.java or your wish
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
  
public class ArjunPinpoint 
{
  
    public static void main(String a[])
    {
        BufferedReader br = null;
        String strLine = "";
        try
        {
            br = new BufferedReader( new FileReader("ArjunPinpoint.txt"));
            while( (strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
            }
            br.close();
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

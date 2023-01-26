//Read contents from a file into byte array - Java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class ArjKeys 
{
	public static void main(String a[])
	{       
        String file_name = "README.md";
        InputStream fins = null;
        try 
		{
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0)
			{
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } 
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        } 
		finally 
		{
            try
			{
                if(fins != null) fins.close();
            } 
			catch(Exception ex)
			{
                 
            }
        }
    }
}
/*
Output:
Providing Java programs for your/student's question. So Don't hesitate to ask question. We'll provide codings for you. So that both can practice well.
*/

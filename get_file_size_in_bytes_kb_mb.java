//Get file size in bytes, kb, mb - Java
import java.io.File;
  
public class ArjKeys 
{
    public static void main(String[] args) 
    {
        File file = new File("get_file_size_in_bytes_kb_mb.java");
        if(file.exists())
        {
            System.out.println(filesize_in_Bytes(file));
            System.out.println(filesize_in_kiloBytes(file));
            System.out.println(filesize_in_megaBytes(file));
        }
        else
            System.out.println("File doesn't exist");
          
    }
  
    private static String filesize_in_megaBytes(File file) 
    {
        return (double) file.length()/(1024*1024)+" mb";
    }
  
    private static String filesize_in_kiloBytes(File file) 
    {
        return (double) file.length()/1024+"  kb";
    }
  
    private static String filesize_in_Bytes(File file) 
    {
        return file.length()+" bytes";
    }
 }
/*
Output:
795 bytes
0.7763671875  kb
7.581710815429688E-4 mb
*/

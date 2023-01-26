//Java program to get last modified time of a file.
import java.io.File;
import java.util.Date;
 
public class Main 
{
    public static void main(String[] args) 
    {
        File file = new File("Main.java");
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");     
     }
}

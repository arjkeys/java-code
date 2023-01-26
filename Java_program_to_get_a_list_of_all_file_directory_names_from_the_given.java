import java.io.File;
import java.util.Date;
 
public class Main 
{
    public static void main(String a[])
    {
        File file = new File("C:/Users/Arjun/Desktop/");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
    }
}

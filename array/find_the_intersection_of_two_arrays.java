/*
Find the intersection of two arrays - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
    static Scanner scan=new Scanner(System.in);
    static int n = 5;
    static int a[] = {1,2,3,4,5};
    static int b[] = {3,4,5,6,7,8};
     
    public static void Find_Intersection() //find common elements
    {
        for(int i=0;i<n;i++)//a
        {
            for(int j=0;j<n;j++)//b
            {
                if(a[i]==b[j])
                    System.out.print(a[i]+" ");
            }
        }
    }       
    public static void main(String args[])
    {
        n=scan.nextInt();
         
        Find_Intersection();
    }
}

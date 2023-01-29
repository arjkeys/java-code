/*
Find the second largest & smallest elements in an array - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
    static Scanner scan=new Scanner(System.in);
    static int n=8;
    static int a[]={108, 4, 360, 6, 756, 18, 2, 36};
          
    public static void sorting() //sorting array elements
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j]) // if second element is smallest than first element
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
      
    public static void main(String args[])
    {
        n=scan.nextInt();
          
        sorting();
          
        System.out.println(a[n-2]); //second largest element
        System.out.println(a[1]); //second smallest element
    }
}

/*
Find all pairs of elements in an integer array whose sum is equal to a given number - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
    static int a[]={4,6,5,-10,8,5,20}; //array
    static int k=10; //given number
    static int n=a.length; //length of an array
     
    public static void findPair()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i]+a[j])==k)
                {
                    System.out.println(a[i]+"+"+a[j]+"="+k);
                }
            }
        }
    }
    public static void main(String args[])
    {
        findPair();
    }
}

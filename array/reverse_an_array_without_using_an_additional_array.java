/*
Reverse an array without using an additional array - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{      
 
    static int arr[]={4,-5,9,11,25,13,12,8,1,13,40,15,8,10,-15};
 
    static int n=arr.length;
     
    public static void reverseArray() //to remove duplicate elements
    {
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
     
    public static void main(String args[])
    {
        reverseArray();
         
        System.out.println(Arrays.toString(arr));
    }
}

/*
Check the equality of two arrays - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
    static int n=11;
    static int a[]={108, 4, 6, 360, 6, 756, 108, 18, 2, 2, 36};
    static int b[]={108, 4, 6, 360, 6, 756, 108, 18, 2, 2, 36};
     
    static boolean f=true;
    public static void checkEqu()
    {
        for(int i=0;i<n;i++)
            if(a[i]!=b[i])
                f=false;
    }
    public static void main(String args[])
    {
        checkEqu();
        System.out.println(f);
    }
}

/*
Find duplicate elements in an array - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
	static int n=11;
	static int arr[]={108, 4, 6, 360, 6, 756, 108, 18, 2, 2, 36};
	public static void findDup()
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	public static void main(String args[])
	{
		findDup();
	}
}

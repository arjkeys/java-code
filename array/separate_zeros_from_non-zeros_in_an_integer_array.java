/*
Separate zeros from non-zeros in an integer array - Java
Note: Rename this filename as Main.java or your wish
*/
import java.util.*;
public class ArjKeys
{
	static int a[]={1, 4, 3, 4, 0, 1, 5, 1, 1, 2, 0, 1, 8, 7, 6, 7, 0, 2, 4, 0, 3, 4, 7, 0, 4, 8, 0, 1, 5, 2, 0, 4, 1, 7, 1, 6, 7, 8, 0, 0, 0, 0, 8, 0, 8, 7, 1, 4, 8, 6, 4, 0, 0, 8, 1, 0, 0, 0, 2, 5, 4, 8, 8, 0, 3, 1, 1, 6, 7, 7, 5, 8, 4, 6, 0, 6, 2, 1, 3, 5, 7, 8, 8, 4, 8, 5, 7, 3, 7, 5, 8, 0, 3, 3, 6, 2, 6, 8, 6, 5}; //array
	static int k=10; //given number
	static int n=a.length; //length of an array
	
	public static void move0toEnd()
	{
		int bigin=0;
		for(int i=0;i<n;i++) //to push non-zeros in bigin
		{
			if(a[i]!=0)//if non zero
			{
				a[bigin]=a[i];
				bigin+=1;
			}
		}
		while(bigin<n) //rest of element is consider as 0
		{
			a[bigin]=0;
			bigin+=1;
		}
		
	}
	public static void main(String args[])
	{
		move0toEnd();
		
		for(int i:a)
			System.out.print(i+" ");
	}
}

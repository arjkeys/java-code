/*
Write a java program that allows you to create only one instance of a class 'President'.
Note: Rename this filename as Main.java or your wish
*/
package practice;
import java.io.*;
class President
{
	private static volatile President instance = new President();
	
	private President() {}
	
	public static President getInstance()
	{
		return instance;
	}
	
	void disp(String content)
	{
		System.out.println("disp() "+content);
	}
}
//code copied from https://wp.me/pc8BF4-19m
class  Main 
{
	public static void main(String[] s)  throws IOException
	{
		/*
		President obj2 = new President(); //this is not possible because constructor is private
		*/
		President obj=President.getInstance();
		obj.disp("with new object");
		
		President.getInstance().disp("without object");
	}
}

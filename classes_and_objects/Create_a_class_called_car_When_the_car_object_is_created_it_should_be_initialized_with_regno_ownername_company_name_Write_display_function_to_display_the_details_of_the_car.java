/*
Create a class called car. 
When the car object is created, it should be initialized with regno, ownername, company name. 
Write display function to display the details of the car.
*/
package practice;
import java.io.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Car
{
	int regNumber;
	String ownerName;
	String companyName;
	
	Car(int regNumber, 	String ownerName, 	String companyName)
	{
		this.regNumber=regNumber;
		this.ownerName=ownerName;
		this.companyName=companyName;
	}
	void display()
	{
		System.out.println("The "+companyName+" car  with "+regNumber+" as register number was ownered by "+ownerName);
	}
}
//code copied from https://wp.me/pc8BF4-19m
class  Main 
{
	public static void splitInput()
	{
		
	}
	public static void main(String[] s)  throws IOException
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Register Number: ");
		int regNumber=scan.nextInt();
		System.out.print("Enter Owner Name: ");
		String ownerName=scan.next();
		System.out.print("Enter Company Name: ");
		String companyName=scan.next();

		Car car=new Car(regNumber, ownerName, companyName);
		
		car.display();
	}
}

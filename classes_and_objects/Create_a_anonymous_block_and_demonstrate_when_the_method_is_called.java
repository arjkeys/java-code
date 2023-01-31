/*
Create a anonymous block and demonstrate when the method is called.
*/
package practice;
import java.io.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
 
class Calculator
{
    {
        System.out.println("YOUR RESULT ");
    }
    void add(int a, int b)
    {
        System.out.println("add: "+(a+b));
    }
    void sub(int a, int b)
    {
        System.out.println("sub: "+(a-b));
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
        Calculator calc=new Calculator();
        calc.add(10,20);
        calc.sub(20,10);
    }
}

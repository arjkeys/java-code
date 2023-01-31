/*
Create a class called Calculator which has 4 methods add, sub, mult and div.
Create an application to access these methods.
*/
package practice;
import java.io.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
 
class Calculator
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void sub(int a, int b)
    {
        System.out.println(a-b);
    }
    void mult(int a, int b)
    {
        System.out.println(a*b);
    }
    void div(int a, int b)
    {
        System.out.println(a/b);
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
        System.out.println(":::CALCULATOR: ADD, SUB, MULT, DIV:::");
         
        Calculator calc=new Calculator();
                 
        Scanner scan=new Scanner(System.in);
        boolean doProcess=true;
        while(doProcess)
        {
            System.out.println("\na: ");
            int a=scan.nextInt();
            System.out.println("b: ");
            int b=scan.nextInt();
            System.out.println("operation(+,-,*,/): ");
            char oper=scan.next().charAt(0);
             
            if(oper=='+')
                calc.add(a,b);
            else if(oper=='-')
                calc.sub(a,b);
            else if(oper=='*')
                calc.mult(a,b);
            else if(oper=='/')
                calc.div(a,b);
            else
                System.out.println("Invalid input...");
             
            System.out.println("\nDo you want to continue(Y/N): ");
            char choose=scan.next().charAt(0);
            if(choose=='N' || choose=='n')
                doProcess=false;
         
        }
    }
}

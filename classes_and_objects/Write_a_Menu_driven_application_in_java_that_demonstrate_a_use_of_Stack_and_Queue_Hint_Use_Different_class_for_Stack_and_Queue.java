/*
Write a Menu driven application in java that demonstrate a use of Stack and Queue. 
(Hint : Use Different class for Stack and Queue)
*/
package practice;
import java.io.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
 
class StackOperation
{
    void Operation()
    {
        Scanner scan=new Scanner(System.in);
        Stack<Integer> stk= new Stack<>();
        int whatToDo=0;
        while(whatToDo!=5)
        {
            System.out.print("\n1.Push, 2.Pop, 3.Peek, 4.Display, 5.Exit: ");
            whatToDo=scan.nextInt();
             
            if(whatToDo==1)
            {
                System.out.print("Enter element to push: ");
                stk.push(scan.nextInt());
            }
            else if(whatToDo==2)
            {
                if(!stk.empty())
                    System.out.println("Top of the stack: "+stk.pop()+" removed");
                else
                    System.out.println("Stack is Empty: can't remove");
            }
            else if(whatToDo==3)
            {
                if(!stk.empty())
                    System.out.println("Top of the stack: "+stk.peek());
                else
                    System.out.println("Stack is Empty: can't get");
            }
            else if(whatToDo==4)
                System.out.println("Stack elements: "+stk);
            else
                whatToDo=5;
        }
    }
}
class QueueOperation
{
    void Operation()
    {
        Scanner scan=new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int whatToDo=0;
        while(whatToDo!=5)
        {
            System.out.print("\n1.Add, 2.Remove, 3.Peek, 4.Display, 5.Exit: ");
            whatToDo=scan.nextInt();
             
            if(whatToDo==1)
            {
                System.out.print("Enter element to push: ");
                que.offer(scan.nextInt());
            }
            else if(whatToDo==2)
            {
                if(!que.isEmpty())
                    System.out.println("First of queue: "+que.poll()+" removed");
                else
                    System.out.println("Queue is Empty: can't remove");
            }
            else if(whatToDo==3)
            {
                if(!que.isEmpty())
                    System.out.println("First of queue: "+que.peek());
                else
                    System.out.println("Queue is Empty: can't get");
            }
            else if(whatToDo==4)
                System.out.println("Queue elements: "+que);
            else
                whatToDo=5;
        }
    }
}
class  Main 
{
    public static void main(String[] s)  throws IOException
    {
        StackOperation stack=new StackOperation();
        QueueOperation queue=new QueueOperation();
         
        Scanner scan=new Scanner(System.in);
        boolean choose=true;
        while(choose)
        {
            System.out.print("\nSelect stack(S) or queue(Q) operation: ");
            char chooseSQ=scan.next().charAt(0);
             
            if(chooseSQ=='S' || chooseSQ=='s')
                stack.Operation();
            else if(chooseSQ=='Q' || chooseSQ=='q')
                queue.Operation();
            else
                choose=false;
        }
    }
}

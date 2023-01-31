/*
Create a class called Student with the following details: 
RollNo, StudName, MarksInEng, MarksInMaths and MarksInScience. 
Display the total marks and Percentage of the student.
*/
package practice;
import java.io.*;
import java.util.Scanner;
class Students
{
    public String rollNumber;
    public String studName;
    public int markInEnglish;
    public int markInMaths;
    public int markInScience;
     
    public void assignValues(String rollNumber,String studName,int markInEnglish,int markInMaths,int markInScience)
    {
        this.rollNumber=rollNumber;
        this.studName=studName;
        this.markInEnglish=markInEnglish;
        this.markInMaths=markInMaths;
        this.markInScience=markInMaths;
    }
    public void totalMarksWithPercentage()
    {
        int total=markInEnglish+markInMaths+markInScience;
        System.out.print("Hi "+studName+" your total mark is "+total+" with "+(total/3)+"%");
    }
}
class  Main 
{
    public static void main(String[] s)  throws IOException
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        String rollNumber=scan.next();
        System.out.print("Enter your name: ");
        String studName=scan.next();
        System.out.print("Enter mark in english: ");
        int markInEnglish=scan.nextInt();
        System.out.print("Enter mark in maths: ");
        int markInMaths=scan.nextInt();
        System.out.print("Enter mark in science: ");
        int markInScience=scan.nextInt();
         
        Students newStudent=new Students();
        newStudent.assignValues(rollNumber, studName, markInEnglish, markInMaths, markInScience);
        newStudent.totalMarksWithPercentage();
    }
}

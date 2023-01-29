/*
Define a class to represent a bank account. Include the following members:
Data Members:
a.Name of the Depositor
b.Account Number
c.Type of Account
d.Balance amount in the account
Data Methods:
a.To assign initial values
b.To deposit an amount
c.To withdraw an amount
d.To display name and balance.
*/
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
/*
Define a class to represent a bank account. Include the following members: 
Data Members:
a.Name of the Depositor
b.Account Number
c.Type of Account
d.Balance amount in the account
Data Methods:
a.To assign initial values
b.To deposit an amount
c.To withdraw an amount 
d.To display name and balance.
*/
package practice;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;   
 
class Bank
{
    public String nameOfDepositor;
    public int accNumber;
    public String accType;
    public double balanceAmount;
     
    public void assignValues(String nameOfDepositor, String accType, double balanceAmount)
    {
        this.nameOfDepositor=nameOfDepositor;
        this.accType=accType;
        this.balanceAmount=balanceAmount;
         
        Random random = new Random();
        this.accNumber=random.nextInt(1000000);
        System.out.println("Your new account number is: "+accNumber);
    }
    public void depositAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to deposit\nNote:please assign values to create an account");
        else
        {
            balanceAmount+=amount;
            System.out.println("Amount deposited successfully...");
        }
    }
    public void withdrawAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to credit\nNote:please assign values to create an account");
        else if(balanceAmount>amount)
        {
            balanceAmount-=amount;
            System.out.println("Amount credited successfully...");
        }
        else
            System.out.println("! Insufficient balance");
    }
    public void displayDetails()
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account\nNote:please assign values to create an account");
        else
        {
            System.out.println("Name of the Depositor: "+nameOfDepositor);
            System.out.println("Balance amount in the account: "+balanceAmount);
        }
    }
    public void getInput()
    {
        System.out.println("How can i help you?");
        System.out.println("1. Open account");
        System.out.println("2. Deposit amount");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Account details");
        System.out.println("5. Exit");
        System.out.print("Please choose from above (Eg.2): ");
    }
}
//code copied from https://wp.me/pc8BF4-19m
class  Main 
{
    public static void main(String[] s)  throws IOException
    {
        System.out.println("::::::::::WELCOME TO XYZ BANK::::::::::");
        Bank newAccount=new Bank();
         
        Scanner scan=new Scanner(System.in);
        boolean process=true;
        int continueState=0;
         
        while(continueState==0)
        {
            newAccount.getInput();
            int currentProcess=scan.nextInt();
             
            if(currentProcess==1)
            {
                System.out.print("Enter your name: ");
                String nameOfDepositor=scan.next();
                System.out.print("Enter your account type: ");
                String accType=scan.next();
                System.out.print("Enter your opening balance: ");
                double  balanceAmount=scan.nextDouble();
                newAccount.assignValues(nameOfDepositor, accType, balanceAmount);
            }
            else if(currentProcess==2)
            {
                System.out.print("Enter amount to deposit: ");
                newAccount.depositAmount(scan.nextDouble());
            }
            else if(currentProcess==3)
            {
                System.out.print("Enter amount to withdraw: ");
                newAccount.withdrawAmount(scan.nextDouble());
            }
            else if(currentProcess==4)
            {
                newAccount.displayDetails();
            }
            else if(currentProcess==5)
            {
                continueState=1;
                System.out.println("THANK YOU");
            }
 
            System.out.print ("press 0 to continue... ");
            continueState=scan.nextInt();
        }
    }
}

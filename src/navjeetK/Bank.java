package navjeetK;


	
	import java.util.Scanner;

	public class Bank {

	    private double amount;

	    private int accountNum;

	    private String name;

	    int count=0;

	    int count1=0;

	    Bank(double amount, int accountNum, String name)
	    {
	        this.amount=amount;

	        this.accountNum=accountNum;

	        this.name=name;
	    }

	    void deposit(double amount1)
	    {
	      amount=amount+amount1;

	        System.out.println("Your account is credited with amount  : " + amount1 + " and Total Available Balance is : " + amount);
	    }

	    void withDraw(double amount2)
	    {

	        if (amount2>amount)
	        {
	            System.out.println("Insufficient Fund");
	        }
	        else
	        {
	            amount=amount-amount2;

	            System.out.println("Your account is debited with amount  : " + amount2 + " and Total Available Balance is : " + amount);
	        }

	    }

	    void checkBalance()
	    {

	        System.out.println("Total Available Balance is : " + amount);

	        count1=count1+1;
	    }

	    void displayDetails()
	    {

	        System.out.println("----------------- Account Detail ------------");
	        System.out.println("Account Number :" + accountNum);
	        System.out.println("Name :" + name);
	        System.out.println("Balance Amount :" + amount);

	        count=count+1;
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter User name");

	        String name1=sc.next();

	        System.out.println("Enter Account Number");

	        int accNum=sc.nextInt();

	        System.out.println("Enter Amount Detail");

	        double amount1=sc.nextDouble();

	       Bank b1=new Bank(amount1,accNum,name1);

	       b1.deposit(500);

	     //  b1.checkBalance();

	       b1.withDraw(1500);

	        b1.checkBalance();

	       b1.displayDetails();

	       b1.displayDetails();

	       System.out.println("Number of times user checked the CheckBalance feature : " + b1.count1);

	        System.out.println("Number of times user checked the displayDetails feature : " + b1.count);
	    }
	}
	 



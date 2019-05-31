package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que2Bank {
int acc_no;
String name;
float amount;
Scanner sc= new Scanner(System.in);


void inserData(){
System.out.println("Enter Name");
name= sc.nextLine();
System.out.println("Enter Account number");
acc_no= sc.nextInt();
System.out.println("Enter Amount");
amount= sc.nextFloat();
}

void deposit(){
System.out.println("Deposit");
}

void withdraw(){
System.out.println("Withdraw");
}
void checkBalance(){
System.out.println(amount);
}
void displayDetails(){
System.out.println(name + acc_no + amount);
}

}
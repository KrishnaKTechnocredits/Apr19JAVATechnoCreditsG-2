package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que2BankClient extends Que2Bank{
public static void main(String[] args){
Que2Bank Q2 = new Que2Bank();
Scanner sc = new Scanner (System.in);
System.out.println("Enter i for InsertData, d for deposit, w for Withdraw, c for CheckBalance, dd for displayDetails");

String choice=sc.next();
switch(choice){
case "i" :
Q2.inserData();
break;

case "d" :
Q2.deposit();
break;

case "w" :
Q2.withdraw();
break;

case "c" :
Q2.checkBalance();
break;

case "dd" :
Q2.displayDetails();
break;
}
}

}

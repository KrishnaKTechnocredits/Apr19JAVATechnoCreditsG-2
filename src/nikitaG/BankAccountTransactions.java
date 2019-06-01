package nikitaG;

import java.util.Scanner;

public class BankAccountTransactions {

	static String[] accHolderNames = { "Nikita", "Shashank", "Maulik" };
	static double[] accAmount = { 1500000, 2000000, 2500000 };
	static int[] debitCnt = { 0, 0, 0 };
	static int[] creditCnt = { 0, 0, 0 };
	static int[] viewBalCnt = { 0, 0, 0 };
	String currentName = "";
	int currentIndex;

	boolean isValidAccName(String name) {
		boolean flag = false;
		for (int i = 0; i < accHolderNames.length; i++) {
			if (accHolderNames[i].equalsIgnoreCase(name)) {
				currentName = name;
				currentIndex = i;
				flag = true;
				break;
			}
		}
		return flag;
	}

	boolean checkBalance(double amount) {
		boolean flag = false;
		if (accAmount[currentIndex] >= amount)
			flag = true;
		return flag;
	}

	void checkTransaction(String input, Scanner sc) {
		switch (input) {
		case "1": {
			debitAccount(sc);
			break;
		}
		case "2": {
			creditAccount(sc);
			break;
		}
		case "3": {
			viewAccountBalance(sc);
			break;
		}
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}

	void debitAccount(Scanner sc) {
		System.out.println("Please enter the amount to debit:");
		double amount = sc.nextDouble();
		if (checkBalance(amount)) {
			accAmount[currentIndex] -= amount;
			debitCnt[currentIndex]++;
		} else
			System.out.println("Insufficient balance!");
	}

	void creditAccount(Scanner sc) {
		System.out.println("Please enter the amount to credit:");
		double amount = sc.nextDouble();
		accAmount[currentIndex] += amount;
		creditCnt[currentIndex]++;
	}

	void viewAccountBalance(Scanner sc) {
		System.out.println("Account Holder Name :" + currentName);
		System.out.println("Account Balance :" + accAmount[currentIndex]);
		viewBalCnt[currentIndex]++;
	}
	
	void displayDebitPerUser(){
		System.out.println("Account Holder Name "+" Debit Count");
		for(int i=0;i<accHolderNames.length;i++){
			System.out.println(accHolderNames[i] +"                  "+debitCnt[i]);
		}
	}

	void displayCreditPerUser(){
		System.out.println("Account Holder Name "+" Credit Count");
		for(int i=0;i<accHolderNames.length;i++){
			System.out.println(accHolderNames[i] +"                  "+creditCnt[i]);
		}
	}

	void displayViewBalPerUser(){
		System.out.println("Account Holder Name "+" View Balance Count");
		for(int i=0;i<accHolderNames.length;i++){
			System.out.println(accHolderNames[i] +"                  "+viewBalCnt[i]);
		}
	}
}

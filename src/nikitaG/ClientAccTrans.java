package nikitaG;

import java.util.Scanner;

public class ClientAccTrans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter account holder's name");
		String name = sc.next();
		String confirm;
		BankAccountTransactions b1 = new BankAccountTransactions();
		if (b1.isValidAccName(name)) {
			do
			{
				System.out.println("Please choose the transactions from below");
				System.out.println("1. Debit");
				System.out.println("2. Credit");
				System.out.println("3. View Balance");
				String input = sc.next();
				b1.checkTransaction(input, sc);
				System.out.println("Do yo want to continue? (Y/N)");
				confirm = sc.next();
			}while(confirm.toLowerCase().charAt(0) == 'y' || confirm.equalsIgnoreCase("yes"));
			
			BankAccountTransactions b2 = new BankAccountTransactions();
			b2.displayDebitPerUser();
			b2.displayCreditPerUser();
			b2.displayViewBalPerUser();

		} else
			System.out.println("Account holder's name is invalid!");
		
		
	}
}

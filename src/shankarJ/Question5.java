package shankarJ;

import java.util.Scanner;

public class Question5 {
	
	//5) WAP to check if a number is Armstrong or not 
	
	public static void main(String[] args) {

		int num, number, temp, total = 0;
		System.out.println("Ënter your Number :");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		number = num;

		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + temp * temp * temp;
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
		scanner.close();
	}
}

package nikitaG;

import java.util.Scanner;

public class A3Q5ArmstrongNo {

	int readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		return sc.nextInt();
	}

	int armstrongNo(int num) {
		int armstrongNo = 0;
		int countDigit = 0;
		int tempNum = num;
		while (tempNum != 0) {
			tempNum = tempNum / 10;
			countDigit++;
		}
		while (num != 0) {
			tempNum = num%10;
			armstrongNo = (int) (armstrongNo + Math.pow(tempNum,countDigit));
			num = num / 10;
		}
		return armstrongNo;
	}
	
	public static void main(String[] args) {
		A3Q5ArmstrongNo a3q5ArmstrongNo = new A3Q5ArmstrongNo();
		int numInput = a3q5ArmstrongNo.readValues();
		int numOutput = a3q5ArmstrongNo.armstrongNo(numInput);
		if(numInput == numOutput)
			System.out.println("Armstrong number: "+numOutput);
		else
			System.out.println("Non Armstrong number: "+numOutput);
	}
}

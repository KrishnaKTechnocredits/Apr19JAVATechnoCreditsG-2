package nikitaG;

public class PrimeNumberCalc {

	int primeNumbers(int start, int end) {
		int sumOfPrimeNum = 0;
		for (int i = start; i <= end; i++) {
			if (primeNumber(i) && i != 1)
				sumOfPrimeNum += i;
		}
		return sumOfPrimeNum;
	}

	boolean primeNumber(int num) {
		boolean temp = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				temp = false;
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println("Sum of prime numbers between 1 & 10 :" + new PrimeNumberCalc().primeNumbers(1, 10));
		// System.out.println(new PrimeNumberCalc().primeNumber(2));
	}
}

package navjeetK;

public class DigitSum {
	int number2;

	int number3 = 0;

	void sumDigit(int number) {

		while (number != 0) {
			number2 = number % 10;

			number3 = number3 + number2;
			number = number / 10;
		}

		System.out.println(number3);
	}

	public static void main(String[] args) {
		DigitSum ds = new DigitSum();

		ds.sumDigit(12345);
	}

}

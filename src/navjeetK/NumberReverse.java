package navjeetK;

public class NumberReverse {

	int number2;

	void reverse(int number) {

		while (number != 0) {
			number2 = number % 10;

			System.out.print(number2);

			number = number / 10;
		}

	}

	public static void main(String[] args) {
		NumberReverse sr = new NumberReverse();

		sr.reverse(12345);
	}

}

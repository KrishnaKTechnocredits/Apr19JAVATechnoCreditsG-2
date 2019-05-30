package navjeetK;

public class Armstrong {

	int number2;

	int number3 = 0;

	void armstrong1(int number) {

		int num = number;

		while (num != 0) {
			number2 = num % 10;

			number3 = number3 + number2 * number2 * number2;
			num = num / 10;
		}

		if (number3 == number)
			System.out.println(number3 + " is Armstrong");
		else
			System.out.println(number3 + " is not Armstrong");

	}

	public static void main(String[] args) {
		Armstrong a1 = new Armstrong();

		a1.armstrong1(153);
	}

}

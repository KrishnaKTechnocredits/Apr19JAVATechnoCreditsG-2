package navjeetK;

public class Factorial {

	static void factorialNumber(int num) {

		int num1 = 1;

		for (int i = num; i >= 1; i--) {
			num1 = num1 * i;
		}

		System.out.println(num1);

	}

	public static void main(String[] args)

	{

		factorialNumber(5);
	}

}

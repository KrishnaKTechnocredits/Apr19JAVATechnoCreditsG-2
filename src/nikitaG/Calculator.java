package nikitaG;

public class Calculator {

	int addition(int x, int y) {
		return x + y;
	}

	int substraction(int x, int y) {
		return x - y;
	}

	int division(int x, int y) {
		return x / y;
	}

	int multiplication(int x, int y) {
		return x * y;
	}

	int remainder(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Addition       : " + calculator.addition(10, 20));
		System.out.println("Substraction   : " + calculator.substraction(50, 25));
		System.out.println("Division       : " + calculator.division(90, 3));
		System.out.println("Multiplication : " + calculator.multiplication(23, 4));
		System.out.println("Remainder      : " + calculator.remainder(100, 33));
	}
}

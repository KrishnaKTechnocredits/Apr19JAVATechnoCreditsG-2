package nikitaG;

public class SwapNumber {

	void swapNumbers(int num1, int num2) {
		System.out.println("Numbers before swap :" + num1 + "," + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after swap  :" + num1 + "," + num2);
	}

	public static void main(String[] args) {
		new SwapNumber().swapNumbers(10, 20);
	}
}

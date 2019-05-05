package nikitaG;

public class SwapNumbersTemp {

	void swapNumbers(int num1, int num2) {
		System.out.println("Numbers before swap :" + num1 + "," + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swap  :" + num1 + "," + num2);
	}

	public static void main(String[] args) {
		new SwapNumbersTemp().swapNumbers(12, 13);
	}
}

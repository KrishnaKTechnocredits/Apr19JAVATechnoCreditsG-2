package shankarJ;

//without using third variable.
public class SwapNumbers {

	public static void main(String[] args) {
		SwapNumbers sn = new SwapNumbers();
		int x, y;
		x = 10;
		y = 5;
		System.out.println(sn);
		System.out.println("Before swapping - x: " + x + ", y: " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping  - x: " + x + ", y: " + y);

	}

}

package padmajaD;

public class ArithmaticOperations {
	public static void main(String[] arg) {
		
		System.out.println(sum(10, 20));
		System.out.println(mul(10, 20));
		System.out.println(sub(20, 10));
		System.out.println(rem(25, 10));

	}

	static int sum(int x, int y) {
		int z = x + y;
		return z;
	}

	static int mul(int x, int y) {
		int z = x * y;
		return z;
	}

	static int sub(int x, int y) {
		int z = x - y;
		return z;
	}

	static int rem(int x, int y) {
		int z = x % y;
		return z;
	}

}

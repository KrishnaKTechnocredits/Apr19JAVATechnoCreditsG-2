package sumanaS;

public class Assign1Ques1 {

	static int Add(int x, int y) {

		return x + y;

	}

	static int Sub(int x, int y) {

		return x - y;
	}

	static int Mul(int x, int y) {

		return x * y;
	}

	int Div(int x, int y) {

		int ans = x / y;
		return ans;

	}

	int mod(int x, int y) {

		return x % y;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition is " + Add(10, 50));
		System.out.println("Substraction is " + Sub(100, 50));
		System.out.println("Multiplication is " + Mul(20, 8));

		Assign1Ques1 ob1 = new Assign1Ques1();

		System.out.println("Division is " + ob1.Div(100, 10));

		System.out.println("Remainder is " + ob1.mod(100, 5));

	}

}

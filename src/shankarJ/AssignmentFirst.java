package shankarJ;

class AssignmentFirst {

	int a = 68;
	int b = 13;

	public static void main(String[] args) {
		AssignmentFirst a = new AssignmentFirst();
		a.sum();
		a.multi();
		a.sub();
		a.div();
		a.rem();
	}

	void sum() {
		int sum = a + b;
		System.out.println("sum is" + "\t" + sum);	
	}

	void multi() {
		int multi = a * b;
		System.out.println("multiplication is" + "\t" + multi);
	}

	void sub() {
		int sub = a - b;
		System.out.println("sub is" + "\t" + sub);
	}

	void div() {
		int div = a / b;
		System.out.println("div is" + "\t" + div);
	}

	void rem() {
		int rem = a % b;
		System.out.println("rem is" + "\t" + rem);
	}

}

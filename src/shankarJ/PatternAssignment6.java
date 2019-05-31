package shankarJ;

public class PatternAssignment6 {

	public static void main(String[] args) {

		int n = 3;
		m1(n);

	}

	public static void m1(int n) {

		int a, b, num = 0;  

		for (a = 1; a <= n; a++) {

			for (b = 1; b <= n; b++) {
				num = num + 3;
				System.out.print(num + " ");
				
			}

			System.out.println();
		}
	}
}


package shankarJ;

public class PatternAssignment2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int a = i; a < 4; a++) {
				if (a % 2 != 0) {
					System.out.print("# ");
				} else
					System.out.print("* ");
			}
			for (int a = 1; a <= i; a++) {
				if (a % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print("# ");
			}
			System.out.println();
		}

	}

}

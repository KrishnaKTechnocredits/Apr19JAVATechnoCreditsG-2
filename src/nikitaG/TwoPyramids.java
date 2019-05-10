package nikitaG;

public class TwoPyramids {
	static void display(int num) {
		for (int i = 1; i <= num * 2 - 1; i++) {
			if (i <= num)
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
			if (i > num)
				for (int j = 1; j <= num * 2 - i; j++) {
					System.out.print(j + " ");
				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		display(4);
	}
}

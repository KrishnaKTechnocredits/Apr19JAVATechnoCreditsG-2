package tejashreeT;

public class Pattern4 {

	void display() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {

				if (i % 2 == 0) {
					if (j % 2 != 0)
						System.out.print("*");
					else
						System.out.print(j);

				} else {
					if (j % 2 == 0) {
						System.out.print("*");
					} else
						System.out.print(j);
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern4 p1 = new Pattern4();
		p1.display();
	}
}

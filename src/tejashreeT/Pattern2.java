package tejashreeT;

public class Pattern2 {

	void display() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {

				if (i % 2 == 0) {
					if (j % 2 != 0)
						System.out.print("*");
					else
						System.out.print("#");

				} else {
					if (j % 2 == 0) {
						System.out.print("*");
					} else
						System.out.print("#");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern2 p1 = new Pattern2();
		p1.display();
	}
}

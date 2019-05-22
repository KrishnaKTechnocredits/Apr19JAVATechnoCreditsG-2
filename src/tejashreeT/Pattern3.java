package tejashreeT;

public class Pattern3 {

	void display() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print(j);
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		Pattern3 p1 = new Pattern3();
		p1.display();
	}
}

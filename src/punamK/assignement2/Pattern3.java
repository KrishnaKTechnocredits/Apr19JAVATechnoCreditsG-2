package punamK.assignement2;

public class Pattern3 {
	public static void main(String[] args) {
		Pattern3 pattern3 = new Pattern3();
		pattern3.call3(5);
	}

	void call3(int value) {
		for (int i = 1; i <= value; i++) {
			for (int j = value; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

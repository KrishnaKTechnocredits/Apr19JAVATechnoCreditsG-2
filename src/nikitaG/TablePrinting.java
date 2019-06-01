package nikitaG;

public class TablePrinting {
	static void display(int num) {
		int count = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(count * num + " ");
				count++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		display(3);
	}
}

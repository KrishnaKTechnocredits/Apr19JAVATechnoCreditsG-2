package nikitaG;

import java.util.Scanner;

public class StringArrayEx1 {

	void getMiddleChar(String[] data) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].length() % 2 == 0)
				System.out.println(data[i] + " -> " + data[i].charAt((data[i].length() / 2) - 1));
			else
				System.out.println(data[i] + " -> " + data[i].charAt((data[i].length() / 2)));
		}
	}

	String[] readValues() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().split(" ");
	}

	public static void main(String[] args) {
		StringArrayEx1 se1 = new StringArrayEx1();
		System.out.println("Please enter Names:");
		se1.getMiddleChar(se1.readValues());
	}
}

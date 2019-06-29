package punamK.collectionsAssignment;

import java.util.ArrayList;

public class Question4 {
	// public static void main(String[] args) {
	// String str1 = "3 sky is blue!";
	// char[] array1 = str1.toCharArray();
	// ArrayList<Character> al = new ArrayList<Character>();
	// for (int i = 0; i < array1.length; i++) {
	// char ch = ' ';
	// System.out.print(array1[i]);
	// if ((array1[i] >= 65 && array1[i] <= 90) || (array1[i] >= 97 && array1[i]
	// <= 127)) {
	// ch = (char) (array1[i] + 1);
	// al.add(ch);
	// }
	//
	// if ((array1[i] >= 32 && array1[i] <= 47) || (array1[i] >= 58 && array1[i]
	// <= 64)){
	// ch = (char) array1[i];
	// al.add(ch);
	// }
	// }
	//
	// System.out.println(al);
	// for (char ch : al) {
	// System.out.print(ch);
	// }
	// }

	// another way without using arraylist

	public static void main(String[] args) {
		String str1 = "3 sky is blue!";
		System.out.println(str1);
		char[] array1 = str1.toCharArray();
		char ch = ' ';
		for (int i = 0; i < array1.length; i++) {
			if ((array1[i] > 'A' && array1[i] <= 'Z') || (array1[i] >= 'a' && array1[i] <= 'z')) {
				ch = (char) (array1[i] + 1);
				System.out.print(ch);
			} else if (array1[i] >= '0' && array1[i] <= '9') {

			} else {
				ch = (char) array1[i];
				System.out.print(ch);

			}
		}
	}

}
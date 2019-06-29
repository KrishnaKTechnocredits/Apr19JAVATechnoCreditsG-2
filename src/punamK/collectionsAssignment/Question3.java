package punamK.collectionsAssignment;

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		String str1 = "skyIsblue eyeus";
		String str2 = "kIblu";
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		ArrayList<Character> al1 = new ArrayList<Character>();
		for (int i = 0; i < array1.length; i++) {
			al1.add(array1[i]);
		}
		ArrayList<Character> al2 = new ArrayList<Character>();
		for (int i = 0; i < array2.length; i++) {
			al2.add(array2[i]);
		}

		System.out.println(al1);
		System.out.println(al2);
		al1.removeAll(al2);
		System.out.println(al1);

	}

}
